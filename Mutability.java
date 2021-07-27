public class Mutability
{
public static void main(String[] args)
{
String str1="abc";
String str2="abc";
{
System.out.println(str1==str2);
}
str1=str1+"def";
{
System.out.println(str1==str2);
}
}
}