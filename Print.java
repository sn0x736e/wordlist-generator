import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintStream;
public class Print{
public static void print(String str)throws Throwable{
Scanner o1 = new Scanner(System.in);
int min=1,max=10;
System.out.print("Enter min-length:");
min = o1.nextInt();
System.out.print("Enter max-length:");
max = o1.nextInt();
if(max < min | min<=0 | max <=0){
System.out.println("Invalid Input try again");
Thread.sleep(2000);
Menu.menu();
return;}
PrintStream console = System.out;
System.out.println("\t Words Found:"+Calculate.getwords(str.length(),min,max)+"\t"+"(Character-set= '"+str+"')");
System.out.print("\tDo you want to save your wordlist to a file:(y/n):");
String temp = o1.next();
if((temp.equalsIgnoreCase("Y")|temp.equalsIgnoreCase("yes"))){
System.out.println("\tFile Size:"+Calculate.getsize(str.length(),min,max));
System.out.print("\tDo you wish to continue(y/n):");
temp = o1.next();
if(!(temp.equalsIgnoreCase("Y")|temp.equalsIgnoreCase("yes")))
{
Menu.menu();
System.out.println("Returning Back....");
Thread.sleep(3000);
return;
}
System.out.print("\tEnter name of file(Without Extension):");
temp = (new Scanner(System.in)).next();
PrintStream o = new PrintStream(temp+".txt");
System.out.println("\n\t"+temp+".txt"+" will be created in current directory!");
System.out.println("Generating WordList:");
Thread.sleep(800);
for(int i=min;i<=max;i++){
List<String> list1 = Combinate.printCombination1(str,i);
for(String st:list1){
List<String> list2 = Permute.permute1(st);
for(String st1:list2){
System.setOut(o);
System.out.println(st1);
System.setOut(console);
System.out.println(st1);}
}}
System.out.println(temp+".txt"+" created in current directory!");
System.out.println("\n\n**********\tWordlist Created by Shashwat Nema);}
System.out.println("Generating wordlist:");
Thread.sleep(500);
System.setOut(console);
for(int i=min;i<=max;i++){
List<String> list1 = Combinate.printCombination1(str,i);
for(String st:list1){
List<String> list2 = Permute.permute1(st);
for(String st1:list2){
System.out.println(st1);}
}}System.out.println("\n\n**********\tWordlist Created by Shashwat Nema);
}}
