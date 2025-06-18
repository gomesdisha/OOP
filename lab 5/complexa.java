import java.util.Scanner;
class complex{
    private int re,im;
    public complex(){}
    public complex(int a,int b){
        re=a;
        im=b;
    }
    public void add(int r,complex c1){
        re=c1.re+r;
    }
    public void add(complex c1,complex c2){
        re=c1.re+c2.re;
        im=c1.im+c2.im;
    }
    public void display(){
        System.out.println(re+" + "+im+"i");
    }
}
public class complexa{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first complex num: ");
        int r1=sc.nextInt(),i1=sc.nextInt();

        System.out.print("Enter second complex num: ");
        int r2=sc.nextInt(),i2=sc.nextInt();

        complex c1=new complex(r1,i1);
        complex c3=new complex(r1,i1);
        complex c2=new complex(r2,i2);

        System.out.print("Enter integer to be added: ");
        int i=sc.nextInt();


        System.out.println("\nCOMPLEX AND INT ADDITION");
        c3.add(i,c3);
        c3.display();

        System.out.println("\nCOMPLEX ADDITION");
        c1.add(c1,c2);
        c1.display();
        
        sc.close();
    }
}