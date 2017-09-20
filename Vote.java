import java.util.Scanner;
class Vote
{
public static void main(String args[])
{
int []studentAge=new int[10];
String []studentName=new String[10];
Scanner s=new Scanner(System.in);
System.out.println("Enter the names of 10 students:");
for(int i=0;i<10;i++)
{
studentName[i]=s.nextLine();
}
System.out.println("Enter the age of 10 students:");
for(int j=0;j<10;j++)
{
studentAge[j]=s.nextInt();
}
System.out.println("Students eligible for voting after 3 yrs:");

for(int k=0;k<10;k++)
{
if(studentAge[k]==15)
System.out.println(studentName[k]);
}
}
}

