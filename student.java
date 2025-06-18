import java.util.Scanner;
class student_data
{
    
    String name;
    long regno;
    int marks,high,s1,s2,s3;

    student_data(String n,long rn,int m1, int m2, int m3 )
    {
        name= n;
        regno = rn;
        s1 = m1;
        s2 = m2;
        s3 = m3;
    }

    class marks 
    {
        super(s1,s2,s3);
        int total = s1+s2+s3; 
        void display()
        {
          println("Total marks of student is " +total);
        }
    }
}

public class student{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the student name,regno,marks of 3 subjects ");
        String n= sc.nextLine();
        long rn= sc.nextLong();
        int m1=sc.nextInt();
        int m2= sc.nextInt() ;
        int m3=sc.nextInt();
        student_data a1 = new student_data(n,rn,m1,m2,m3);
        //marks x= new marks();
        // x.display();
        student_data a2 = new student_data(n,rn,m1,m2,m3);
       // marks y= new marks();
        // y.display();
        student_data a3 = new student_data(n,rn,m1,m2,m3);
        //marks z= new marks();
        //z.display();
        
        
    }
}