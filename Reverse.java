class Reverse
{
public static void main(String[]args)
{
int len,i;
String str="subbu";
String s="";
len=str.length();
for(i=len-1;i>=0;i--)
{
s=s+str.charAt(i);
}
System.out.println(s);
}
}