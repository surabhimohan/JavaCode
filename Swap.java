import java.util.Scanner;
class Swap
{
public static void main(String[] args)
{
int x,y,a,b,temp;
System.out.print("x= ");
Scanner scn=new Scanner(System.in);
x=scn.nextInt();
System.out.print("y= ");
y=scn.nextInt();
System.out.print("a= ");
a=scn.nextInt();
System.out.print("b= ");
b=scn.nextInt();

x=x+y;
y=x-y;
x=x-y;
System.out.println("x= "+x);
System.out.println("y= "+y);
temp=a;
a=b;
b=temp;
System.out.println("a= "+a);
System.out.println("b= "+b);
}
}