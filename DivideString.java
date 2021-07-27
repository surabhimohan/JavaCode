class DivideString
{
public static void main(String[] args)
{
int n=3,len,div,i,arr=0;

String str="abcdefghijkl";

len=str.length();                  //store length of string
div=len/n;                        //store n equal parts of string

String[] string=new String[n];   //store value of n

if(len % n != 0)
{
System.out.println("this string can't be divided into"+ n +" parts");
}

else
for(i=0;i<len;i=i+div)         //divide string into parts using substring()
{
String s=str.substring(i,i+div);
string[arr]=s;
arr++ ;
}
System.out.println(n+" eual parts of string are: ");
for(i=0;i<string.length;i++)  //iteration of string array 
{
System.out.println(string[i]);
}
}
}
