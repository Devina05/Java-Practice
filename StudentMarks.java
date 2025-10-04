import java.io.*;
import java.util.*;
class StudentMarks{
public static void main(String args[])
{
int marks[] = new int[10];
System.out.println("Enter 10 student marks");
Scanner sc = new Scanner(System.in);

for(int i = 0 ; i<10 ; i++)
{
marks[i]=sc.nextInt();
}

for(int i = 0 ; i <10 ; i++)
{
if(marks[i]==100)
{
System.out.println("Yes Student exist in class A");
}
}


}
}