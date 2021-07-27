//find sum and average of two integer nos.

import java.util.Scanner;
class SumAverage
{
public static void main(String[] args)
{
int x,y,sum=0,avrg=0;
System.out.print("x= ");
Scanner scn=new Scanner(System.in);
x=scn.nextInt();
System.out.print("y= ");
y=scn.nextInt();

sum=x+y;
avrg=(x+y)/2;
System.out.println("sum of nos.: "+sum);
System.out.println("avrg of nos.: "+avrg);
}
}