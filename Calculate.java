public class Calculate{
public static long countsize(int n,int r){
return ((countwords(n,r)*(r+1))+1);
}
public static long countwords(int n,int r){
    return (long)Math.pow(n,r);
    }
public static String getsize(int n,int min,int max){
long num =0;
for(int i=min;i<=max;i++)
num += countsize(n,i);
if(num<Math.pow(2,10))
return (String.valueOf(num)+" Bytes");
else if(num<Math.pow(2,20))
return (String.valueOf(num/(Math.pow(2,10)))+" KB");
else if(num<Math.pow(2,30))
return (String.valueOf(num/(Math.pow(2,20)))+" MB");
else if(num<Math.pow(2,40))
return (String.valueOf(num/(Math.pow(2,30)))+" GB");
else if(num<Math.pow(2,50))
return (String.valueOf(num/(Math.pow(2,40)))+" TB");
else if(num<Math.pow(2,60))
return (String.valueOf(num/(Math.pow(2,50)))+" PB");
else
return ("Too Many Words:Out of Memory");
}
public static long getwords(int n,int min,int max){
long num=0;
for(int i=min;i<=max;i++)
num += countwords(n,i);
return num;
}
private static long fact(int n){
    if (n==0)
    return 1;
long f = 1;
while(n!=0){
f *= n;
n--;
}
return f;
}
}
