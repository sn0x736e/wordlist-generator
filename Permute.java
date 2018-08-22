import java.util.List;
import java.util.ArrayList;
public class Permute{
public static String swap(String str,int i,int j){
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
    public static void permute(String str,int l,int r,List<String> list){
        if(l==r){
        if(list.contains(str))
        return;
        else
        list.add(str);
        }
        else{
            for(int i=l;i<=r;i++){
                str=swap(str,l,i);
                permute(str,l+1,r,list);
                str=swap(str,l,i);
            }
        }
    }
    public static List<String> permute1(String str){
        List<String> list = new ArrayList<String>();
        permute(str,0,str.length()-1,list);
        return list;
    }
}
