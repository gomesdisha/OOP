import java.util.Scanner;
public class calculator
{
    public static void main(String args[])
    {
        float a,b,sum,diff,div,mul;
        char ch,user;
        Scanner inp = new Scanner(System.in);
        
        do{
            System.out.println("enter the first number,operator and the second number ");
        a= inp.nextFloat();
        ch= inp.next().charAt(0);
        b= inp.nextFloat();
        switch(ch)
        {
            case '+' :
                sum=a+b;
                System.out.println("Answer = "+sum);
                break;
            case '-':
                diff=a-b;
                System.out.println("Answer = "+diff);
                break;
            case '/':
                div= a/b;
                System.out.println("Answer = "+div);
                break;
            case '*':
                mul= a*b;
                System.out.println("Answer = "+mul);
                break;
        }

        System.out.println("Do you want to perform a new calculation yes(y) or no(n)");
        user= inp.next().charAt(0);
    }while(user=='y');

        }
    }
