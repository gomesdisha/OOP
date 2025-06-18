import java.util.Scanner;
public class prime
{
    public static void main(String args[])
    {
        int i,j,m,n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 2 limits m and n for prime numbers");
        m=sc.nextInt();
        n=sc.nextInt();

        for(i=m;i<=n;i++)
        {
            int flag =0;
            for(j=2;j<i;j++)
            {
                if( i%j == 0 )
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(i);
            }
        }
    }
}