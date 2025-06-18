import java.util.Scanner;
public class Array
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[5];
       int n;
       System.out.println("Enter the array size:");
        n=sc.nextInt();
       System.out.println("enter the array elements: ");
       try
       {
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
            System.out.println("Array Overflow Exception: "+e.getMessage());
       }
       finally
       {
            System.out.println(" BYEE ");
       }
    }
}