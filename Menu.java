import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Menu{
public static String menu()throws Throwable{
Scanner o1 = new Scanner(System.in);
String str ="";
X:while(true){
System.out.println("\n\t\t\t****************\tDICTIONARY-CREATER\t****************");
System.out.println("\tAdd CharacterSet:");
System.out.println("\t\t0.Alpha-numeric[a-z,A-Z,0-9]");
System.out.println("\t\t1.Small Alphabets[a-z]");
System.out.println("\t\t2.Capital Alphabets[A-Z]");
System.out.println("\t\t3.Numbers[0-9]");
System.out.println("\t\t4.Special Characters[!@#$%^&*()_+<>?]");
System.out.println("\t\t5.Enter Manually");
System.out.println("\t\t6.Enter ASCII");
System.out.println("\t\t7.Continue");
System.out.println("\t\t8.Show Character Set");
if(str.equals(""))
System.out.println("\t\t9.Exit\t\t\tCurrent Characterset:('NULL')");
else
System.out.println("\t\t9.Exit\t\t\tCurrent Characterset:('"+str+"')");
System.out.print("Choose your Option:");
int choice=0;
try{
choice = o1.nextInt();}
catch(Exception e){
System.out.println("Wrong Input! Please Enter again!");
Thread.sleep(1200);
menu();
}
Y:switch(choice){
case 0:
if(str.contains("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz")){
System.out.println("already contains Alpha-Numeric select another Characterset");
Thread.sleep(7000);}
else{
Animate(3);
str += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

System.out.println("\tAlpha-num added!");
Thread.sleep(800);}
break;
case 1:
if(str.contains("abcdefghijklmnopqrstuvwxyz")){
System.out.println("already contains small alphabets select another Characterset");
Thread.sleep(7000);}
else{
Animate(2);
str += "abcdefghijklmnopqrstuvwxyz";
System.out.println("\tSmall Alphabets added!");
Thread.sleep(800);}
break;
case 2:
if(str.contains("ABCDEFGHIJKLMNOPQRSTUVWXYZ")){
System.out.println("already contains Capital alphabets select another Characterset");
Thread.sleep(7000);}
else{
str += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("\tCapital Alphabets added!");
Thread.sleep(800);}
break;
case 3:
if(str.contains("0123456789")){
System.out.println("already contains Numbers select another Characterset");
Thread.sleep(7000);}
else{
Animate(0);
str+= "0123456789";
System.out.println("\tNumbers added!");
Thread.sleep(800);}
break;
case 4:
if(str.contains("\t!@#$%^&*()_+<>?")){
System.out.println("already contains Special Character select another Characterset");
Thread.sleep(7000);}
else{
str += "!@#$%^&*()_+<>?";
Animate(4);
System.out.println("\tSpecial Characters added!");
Thread.sleep(800);}
break;
case 5:
System.out.print("\tex:[abc, 012ab, abcdefgh, ADFSAJI, AFdjifh]\n\tEnter Characters:");
str += (new Scanner(System.in)).next();
str = finalr(str);
System.out.println("\tManual Characters added!");
Thread.sleep(800);
break;
case 6:
System.out.println("\t\tASCII Type");
System.out.println("\t\t\t1.default[33-126]");
System.out.println("\t\t\t2.All[0-127]");
System.out.println("\t\t\t3.Range select[min=0,max=127]");
System.out.print("\t\t\tSelect your choice:");
int c;
try{
c= o1.nextInt();}
catch(Exception e){
System.out.println("Invalid Input!");
Thread.sleep(2000);
break Y;
}
switch(c){
case 1:
String temp="";
for(int i=33;i<=126;i++)
temp += String.valueOf(((char)i));
if(str.contains(temp)){
System.out.println("already contains ASCII Character select another Characterset");
Thread.sleep(1200);
break;}
else{
str+=temp;
Animate(-1);}
break;
case 2:
String temp1="";
for(int i=0;i<=127;i++)
temp1 += String.valueOf(((char)i));
if(str.contains(temp1)){
System.out.println("already contains ASCII Character select another Characterset");
Thread.sleep(1200);
break;}
else{
str+=temp1;
Animate(5);
}
break;
case 3:
int min=0,max=127;
try{
System.out.print("\t\t\tEnter min-value:");
min = o1.nextInt();
System.out.print("\t\t\tEnter max-value:");
max = o1.nextInt();}
catch(Exception e){
System.out.println("\t\t\tInvalid input!!");
Thread.sleep(1200);
menu();
}
if(max < min | max<0 | min<0 | min>127 | max>127)
{
System.out.println("\t\t\tInvalid input!!");
Thread.sleep(1200);
menu();
}
for(int i=min;i<=max;i++)
str += String.valueOf(((char)i));
break;
default:
System.out.println("\t\t\tInValid input!");
Thread.sleep(1000);
break Y;
}
System.out.println("\n\tASCII Characters added!");
Thread.sleep(800);
break;
case 8:
if(str.equals(""))
System.out.println("Nothing in Characterset Please Enter:");
else
System.out.println(str);
Thread.sleep(4000);
break;
case 9:
System.out.print("Exiting\r");
Thread.sleep(1000);
int j=7;
while(j!=0){
System.out.print(".");
Thread.sleep(300);
j--;}
System.out.println();
System.exit(0);
case 7:
return finalr(str);
default:
System.out.println("Invalid Input!");
Thread.sleep(1200);
break Y;
}}
}
public static String finalr(String str){
String[] strlist = str.split("");
// sorting of list
for(int i=0;i<str.length();i++)
for(int j=i+1;j<str.length();j++){
if(strlist[i].compareTo(strlist[j])>0){
String temp = strlist[i];
strlist[i] = strlist[j];
strlist[j]=temp;
}
}
List<String> list = new ArrayList<String>();
for(String temp:strlist){
    if(list.contains(temp))
    continue;
    else
    list.add(temp);
}
return String.join("",list);
}
public static void Animate(int n)throws Throwable{
if(n==-1){
System.out.print("\t\tAdding ASCII Values");
Thread.sleep(200);
for(int ch=33;ch<=126;ch++){
System.out.print((char)ch);
Thread.sleep(20);
}
return;}
else if(n==0){
System.out.print("\t\tAdding Numbers:");
Thread.sleep(200);
for(char ch='0';ch<='9';ch++)
{System.out.print(ch);
Thread.sleep(20);}
return;
}
else if(n==1){
System.out.print("\t\tAdding Capitals:");
Thread.sleep(500);
for(char ch='A';ch<='Z';ch++)
{System.out.print(ch);
Thread.sleep(20);}
return;
}
else if(n==2){
System.out.print("\t\tAdding Small:");
Thread.sleep(500);
for(char ch='a';ch<='z';ch++)
{System.out.print(ch);
Thread.sleep(20);}
return;
}
else if(n==3){
System.out.print("\t\tAdding Numbers, Capitals and small:");
Thread.sleep(500);
for(char ch='0';ch<='z';ch++)
{System.out.print(ch);
if(ch=='9')
ch='A';
if(ch=='Z')
ch='a';
Thread.sleep(20);}
return;
}
else if(n==4){
System.out.print("\t\tAdding Special Characters:");
Thread.sleep(500);
for(char ch=32;ch<=126;ch++){
System.out.print(ch);
if(ch==47)
ch=91;
if(ch==96)
ch=123;
Thread.sleep(20);}
return;
}
else{
System.out.print("\t\tAdding ASCCI Values:");
Thread.sleep(500);
for(int i=0;i<=127;i++){
System.out.print((char)i);
Thread.sleep(20);
}
return;}
}}
