import java.util.Scanner;
class employee{
    private String empname,city;
    private long bsal;
    private float da,hra;
    private double total;

    public void getdata(String s1,String s2,long bsal,float da,float hra){
        empname=s1;
        city=s2;
        this.bsal=bsal;
        this.da=da;
        this.hra=hra;
    }

    public void calculate(){
        total=bsal+(bsal*da/100)+(bsal*hra/100);
    }
    public void display(){
        System.out.println("Employee "+empname+" from "+city+" earns total of "+total);
    }
}
public class imp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name,city,basic salary,DA% and HRA%: ");
        String name=sc.nextLine(),city=sc.nextLine();
        long sal=sc.nextLong();
        float da=sc.nextFloat(),hra=sc.nextFloat();
        employee e1=new employee();
        e1.getdata(name,city,sal,da,hra);
        e1.calculate();
        e1.display();
        sc.close();
    }
}