class Palindrome
{
public static void main(String[]agrs)
{
String str="kick";
int len=str.length();
boolean flag=true;
for(i=0;i<len/2;i++)
{
if(str.charAt(i) != str.charAt((len-i)-1))
{
flag=false;
break;
}
}
if(flag)
System.out.println("string is palindrome");
else
System.out.println("string is not palindrome");
}
}

