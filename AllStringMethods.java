public class AllStringMethods
{
public static void main(String[] args)
{
String s1="Surabhi";
String s2="Monika";
System.out.println("PRINT STRING");
System.out.println(s1);
System.out.println(s2);


String s3="M/o/n/i/k/a";
String[]a1=s3.split("/");
System.out.println("SPLIT STRING USING REGEX ONLY");
for(String s:a1)
{
System.out.println(s);
}
System.out.println("SPLIT STRING USING REGEX WITH LIMIT");
String[]a2=s3.split("/",3);
for(String s:a2)
{
System.out.println(s);
}

System.out.println("USING CONTAINS METHOD");
System.out.println(s1.contains("b"));
System.out.println(s2.contains("j"));

System.out.println("USING LENGTH METHOD");
System.out.println(s1.length());

String s4="surabhi mohan";
String s5="surabhi mohan";
s4=s4.substring(6,10);
s5=s5.substring(3);
System.out.println("USING SUBSTRING METHOD FOR STARTING INDEX");
System.out.println(s4);
System.out.println("USING SUBSTRING METHOD FOR BOTH STARTING & END INDICES");
System.out.println(s5);

System.out.println("CONVERTING STRING TO UPPER CASE");
System.out.println(s4.toUpperCase());
System.out.println(s2.toUpperCase());

System.out.println("USING charAt METHOD");
char ch=s1.charAt(5);
System.out.println(ch);

System.out.println("USING EQUALS METHOD");
System.out.println(s1.equals(s2));
System.out.println("USING equalsIgnoreCase METHOD");
System.out.println(s1.equalsIgnoreCase(s2));

System.out.println("USING CONCAT METHOD");
System.out.println(s1.concat(s2));

System.out.println("USING isEMPTY METHOD");
System.out.println(s1.isEmpty());

System.out.println("USING INTERN METHOD");
System.out.println(s1.intern());

String s6="Hello Subbu";
String s7="Hello Subbu,Hello Mona";
String s8="Hello Subbu,Hello Mona";
System.out.println("USING REPLACE METHOD");
s6=s6.replace('e','a');
System.out.println(s6);
System.out.println("USING replaceAll METHOD");
s7=s7.replaceAll("Hello","Hi");
System.out.println(s7);
System.out.println("USING replaceFirst METHOD");
s8=s8.replaceFirst("Hello","Hi");
System.out.println(s8);

System.out.println("USING TRIM METHOD");
System.out.println(s4.length());
String tr=s4.trim();
System.out.println(tr.length());
System.out.println(tr);
System.out.println(s1+" Mohan");
System.out.println(s1.trim()+"Mohan");
}
}
