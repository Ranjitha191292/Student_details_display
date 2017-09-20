import java.util.Scanner;
class Tot_Char
{
public static void main(String args[])
{
String []studentName=new String[10];
char a[]=new char[20];
int total;
Scanner s=new Scanner(System.in);
System.out.println("Enter the names of 10 students:");
for(int i=0;i<10;i++)
{
total=0;
studentName[i]=s.next();
a=studentName[i].toCharArray();

for(int j:a)
{
total++;
}
System.out.println("The no.of characters is:"+total);
}
}
}
