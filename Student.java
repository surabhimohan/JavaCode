class Student
{
String name;
int rollno;
Student(String name,int rollno)
{
this.name=name;
this.rollno=rollno;
}
public String toString()
{
return "rollno of "+ name+" is "+ rollno;
}
public static void main(String[] args)
{
Student s1=new Student("subbu",1);
Student s2=new Student("surabhi",2);
System.out.println(s1);
System.out.println(s2);
}
}
