import java.util.Scanner;
import java.util.scanner;
class Student_Detail
{
    String name;
    public static String college_name;
    long id;

}
public class student{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Student_Detail.college_name=MIT;
        System.out.println("Enter the student NAME, ID ");
        String n = sc.nextLine();
        long i= sc.nextInt();
        Student_Detail s = new Student_Detail(n,i);
        s.display();
    }
}
