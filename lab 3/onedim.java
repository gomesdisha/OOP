import java.util.Scanner;
public class onedim
{
    public static void main(String args[])
    {
        int a[]={1,2,3,1,2,1,5,6,7};
        int val,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element to search ");
        val= sc.nextInt();
        System.out.println("the value is found at locations:");
        for(i=0;i<9;i++)
        {
            if(a[i]==val)
            {
            System.out.print("a["+i);
            System.out.print("] \n");
            }
        }
    }
}
