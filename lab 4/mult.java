import java.util.Scanner;
public class mult{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.print("Enter number of rows: ");
        row=sc.nextInt();
        System.out.print("Enter number of columns: ");
        col=sc.nextInt();
        int a[][]=new int[row][col];
        int b[][]=new int[row][col];
        int mul[][]=new int[row][col];
        int add[][]=new int[row][col];
        //Insert elements
        System.out.println("Enter FIRST MATRIX elements");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter SECOND MATRIX elements");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("MATRIX AFTER MULTIPLICATION IS");
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                add[i][j]=a[i][j]+b[i][j];
                mul[i][j]=0;
                for(int k=0;k<col;k++)
                {
                    mul[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(mul[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("MATRIX AFTER ADDITION IS");
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(add[i][j]+"   ");
            }
            System.out.println();
        }
    }
}