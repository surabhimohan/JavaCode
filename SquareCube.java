import java.util.*;
class SquareCube
{
public static void main(String[] args)
{
int n,sq=0,c=0,sr=0;
System.out.print("n= ");
Scanner scn=new Scanner(System.in);
n=scn.nextInt();

System.out.println("square of the no.: "+Math.pow(n, 2));
System.out.println("cube of the no.: "+Math.pow(n, 3));
System.out.println("squareroot of the no.: "+Math.sqrt(n));
}
}