class CountCharacters
{
public static void main(String[] args)
{
int charCount=0;
String str="subbu";
for(int i=0;i<str.length();i++)
count[str.charAt(i)]++;
char ch[]=char ch[str.length()];
for(int i=0;i<str.length();i++)
{
ch[i]=str.charAt(i);
for(int j=0;j<=i;j++0
{
if(str.charAt(i)==ch[j])
charCount++;
}
}
System.out.println(str.charAt(i)+ "is" + count[str.charAt(i)]);
}
}