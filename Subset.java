class Subset
{
public static void main(String[]args)
{
int len,size,i,j,arr=0;
String str = "subbu";
len = str.length();
size = len*(len+1)/2;
String[] string = new String[size];

for(i=0;i<len;i++)
{
for(j=i;j<len;j++)
{
String s=str.substring(i,j+1);
string[arr]=s;
arr++ ;
}
}
for(i=0;i<string.length;i++)
{
System.out.println(string[i]);
}
}
}