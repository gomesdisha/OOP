import java.util.Scanner;
public class converttype
{
    public static void main(String args[])
    {
        int anumb,c,d;
        double bnumb;
        char ch;
        byte b,a;
        
        Scanner ina=new Scanner(System.in);

        System.out.println("Enter a charecter");
        ch = ina.next().charAt(0);
        System.out.println("The entered character is "+ch);

        System.out.println("enter an integer number");
        anumb = ina.nextInt();
        System.out.println("The entered integer number is"+anumb);

        System.out.println("enter a double number");
        bnumb = ina.nextDouble();
        System.out.println("The entered double number is "+bnumb);

        b = (byte)anumb ;
        System.out.println("THE integer AFTER CONVERTING TO byte IS "+b);
        c= ch;
        System.out.println("THE charecter AFTER CONVERTING TO integer IS "+c);
        a= (byte)bnumb ;
        System.out.println("THE double AFTER CONVERTING TO byte IS " +a);
        d=(int)bnumb;
        System.out.println("THE double AFTER CONVERTING TO int IS "+d);
        ina.close();
    }
}