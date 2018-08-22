import java.util.Scanner;
public class Main{
public static void main(String[] args)throws Throwable{
Scanner o1 = new Scanner(System.in);
int min,max;
String str = "";
do{
str=Menu.menu();
if(str.equals("")){
System.out.println("Empty Character Set Enter again");
Thread.sleep(3000);}
}while(str.equals(""));
Print.print(str);
}}
