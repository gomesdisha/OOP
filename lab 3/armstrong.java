import java.util.Scanner;
public class armstrong
{
    public static void main(String args[])
    {
        int temp,num,n,re=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the 3 digit number");
        num = sc.nextInt();
        temp = num;
        while(temp>0)
        {
            n = temp%10;
            re= re + n*n*n;
            temp = temp/10;
        }
        if(re==num)
        {
            System.out.println("IT IS AN ARMSTRONG NUMBER");
        }
        else
        {
            System.out.println("IT IS NOT AN ARMSTRONG NUMBER");
        }

    }
}