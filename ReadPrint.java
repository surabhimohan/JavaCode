//how to read and print an integer value

import java.util.Scanner;
class ReadPrint
{
public static void main(String[] args)
{
int a;
System.out.println("enter the value: ");
Scanner scn=new Scanner(System.in);
a=scn.nextInt();

System.out.println("required no.: "+a);
}
}