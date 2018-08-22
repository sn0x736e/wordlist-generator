import java.util.List;
import java.util.ArrayList;
public class Combinate{
public static void CombinationRepetitionUtil(int chosen[], String arr[],
                    int index, int r, int start, int end,List<String> list)
{
    if (index == r)
    {
        String temp = "";
        for (int i = 0; i < r; i++)
            temp += arr[chosen[i]];
        list.add(temp);
        return;
    }
    for (int i = start; i <= end; i++)
    {
        chosen[index] = i;
        CombinationRepetitionUtil(chosen, arr, index + 1,
                                               r, i, end,list);
    }
    return;
}
public static void CombinationRepetition(String arr[], int n, int r,List<String> list)
{
    int[] chosen = new int[r+1];
    CombinationRepetitionUtil(chosen, arr, 0, r, 0, n-1,list);
}
public static List<String> printCombination1(String str,int r){
    List<String> list = new ArrayList<String>();
    CombinationRepetition(str.split(""), str.length(), r,list);
    return list;
}
}
