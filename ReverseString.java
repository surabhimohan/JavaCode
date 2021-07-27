import java.util.Scanner;
public class ReverseString
{
public static void main(String[] args)
{
System.out.println("enter string to reverse: ");:
Scanner scn=new Scanner(System.in);
String str=scn.nextLine();
StringBuilder sb=new StringBuilder();
for(int i=str.length() -1;i>=0;i--)
{
sb.append(str.charAt(i));
}

System.out.println("reversed string: ");
System.out.println(sb.toString());
}
}