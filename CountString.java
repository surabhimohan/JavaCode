class CountString
{
public static void main(String[] args)
{
int charCount=0;
String str="subbu";
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='s')
{
charCount++;
}
}
System.out.println(charCount);
}
}