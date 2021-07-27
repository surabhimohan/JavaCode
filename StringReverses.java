import java.util.Scanner;
class StringToInt
{
public static void main(String[] args)
{
System.out.println("enter string: ");
Scanner scn=new Scanner(System.in);
String s=scn.nextLine();
System.out.println(s.toInt());
}
}
