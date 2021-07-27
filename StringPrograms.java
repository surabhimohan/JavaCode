import java.util.Scanner;
class StringPrograms
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.println("Enter a sentence");
String s=scn.nextLine();
System.out.println(s.replaceAll("\\s",""));
}
}