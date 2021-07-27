import java.util.Scanner;
class EvenOdd
{
public static void main(String[]args)
{
int n;
System.out.print("n= ");
Scanner scn=new Scanner(System.in);
n=scn.nextInt();

if(n%2==0)
{
System.out.println("Number is even");
}
else
{
System.out.println("Number is odd");
}
}
}
