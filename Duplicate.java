class Duplicate
{
public static void main(String[] args)
{
String str="great responsibility";
int len=str.length();
char ch[]=str.toCharArray();
System.out.println("duplicate characters are: ");
for(int i=0;i<ch.length;i++)
{
int count=1;
for(int j=i+1;j<ch.length;j++)
{
if(ch[i]==ch[j] && ch[i] != ' ')
{
count++;
ch[j]='0';
}
}
if(count>1 && ch[i] != '0')
System.out.println(ch[i]);
}
}
}