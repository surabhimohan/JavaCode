class Matrix
{
public static void main(String[] args)
{
int m1[][]={{1,1,1},{2,2,2},{3,3,3}};
int m2[][]={{1,1,1},{2,2,2},{3,3,3}}; 
int s[][]=new int[3][3];

for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
s[i][j]=m1[i][j]+m2[i][j];
System.out.print(s[i][j]);
}
System.out.println();
}
}
}