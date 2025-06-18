import java.util.Scanner;
public class sumnondiag
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
      int i,j,n,sum=0;
      int arr[][]= new int[100][100];
      System.out.println("enter the size of the matrix");
      n = sc.nextInt();
      System.out.println("enter the square matrix");
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
            arr[i][j] = sc.nextInt();
        }
      }
      System.out.println(" \n the non diagonal elements are");
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
            if(i!=j)
            {
                System.out.print(" "+arr[i][j]);
                sum = sum + arr[i][j];
            }
        }
      }
      System.out.println("\n the sum of non diagonal elements is "+sum);
    }
}