class Student
{
String studentName;
int studentAge;
String studentAddress;
Student()
{
}
Student(String n,int a,String addr)
{
StudentName=n;
studentAge=a;
studentAddress=addr;
}
void display()
{
System.out.println("Student name is:"+studentName);
System.out.println("Student age is:"+studentAge);
System.out.println("Student address is:"+studentAddress);
}
class Main
{
public static void main(String as[])
{
Student s=new Student("Raj",21,"No.15,V.O.C.Street,T.Nagar,Chennai-17");
s.display();
}
}

