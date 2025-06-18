import java.util.Scanner;
class employee
{
    String name,city;
    double bsal,da,hra,total;
    Scanner sc=new Scanner(System.in);
    void getdata()
    {
        System.out.println("enter the name,city,basic salary,da and hra of the employee");
        name=sc.nextLine();
        city=sc.nextLine();
        bsal=sc.nextDouble();
        da=sc.nextDouble();
        hra=sc.nextDouble();
    }
    void calculate()
    {
        total = bsal+bsal*da/100+bsal*hra/100;

    }
    void display()
    {
        System.out.println("Employee "+name+" from "+city+" earns total of "+total);  
    }
}
public class eg1
{
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        employee em=new employee();
        em.getdata();
        em.calculate();
        em.display();
    }
}