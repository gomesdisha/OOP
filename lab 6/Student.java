import java.util.Scanner;
class Student{
    String name;
    long regno;
    int age;
    Student(String n,long rn,int a){
        name=n;
        regno=rn;
        age=a;
    }
}

class UG extends Student{
    int semester;
    double fees;
    UG(String n,long rn,int a,int sem,double f){
        super(n,rn,a);
        semester=sem;
        fees=f;
    }
    void display(){
        System.out.print("\n\nUG STUDENT\n\nName: "+name+"\nRegistration Number: "+regno+"\nAge: "+age+"\nSemester: "+semester+"\nFees: "+fees);
    }
}

class PG extends Student{
    int semester;
    double fees;
    PG(String n,long rn,int a,int sem,double f){
        super(n,rn,a);
        semester=sem;
        fees=f;
    }
    void display(){
        System.out.print("\n\nPG STUDENT\n\nName: "+name+"\nRegistration Number: "+regno+"\nAge: "+age+"\nSemester: "+semester+"\nFees: "+fees);
    }
}

class mainfunc{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("(U/P)? ");
        char ch=sc.next().charAt(0);
        System.out.println("Enter student details:");
        if (ch=='u'||ch=='U'){
            String name=sc.nextLine();
            name=sc.nextLine();
            long r=sc.nextLong();
            int a=sc.nextInt();
            int sem=sc.nextInt();
            double fee=sc.nextDouble();
            UG u=new UG(name,r,a,sem,fee);
            u.display();
        }
        else if (ch=='p'||ch=='P'){
            String name=sc.nextLine();
            name=sc.nextLine();
            long r=sc.nextLong();
            int a=sc.nextInt();
            int sem=sc.nextInt();
            double fee=sc.nextDouble();
            PG p=new PG(name,r,a,sem,fee);
            p.display();
        }
        else{
            System.out.println("INVALID OPTION");
        }
        sc.close();
    }
}