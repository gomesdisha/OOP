/*Write a Java program to find whether the matrix is a magic square or not. [Hint: 
Compare the sum for every row, the sum with every column, the sum of the principal 
diagonal and the sum of the non-principal diagonal elements. If they are all same, then 
the matrix is a magic square matrix].*/

import java.util.Scanner;
class MagicSquare
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of square matrix");
		int n = in.nextInt();
		int arr[][] = new int[n][n];
		int rsum[] = new int[n];
		int csum[] = new int[n];
		int pdsum=0 ,npdsum=0;
		boolean magic = true;
		System.out.println("Enter elements of matrix");
		for(int i = 0; i<n; i++)
			for(int j=0; j<n; j++)
				arr[i][j]=in.nextInt();
			
		for(int i=0; i<n; i++)
		{
			rsum[i] = 0;
			csum[i] = 0;
		}
		
		for(int i=0; i<n; i++)
		{
			//rsum[i]=0;
			//csum[i]=0;
			for(int j=0; j<n; j++)
			{
				rsum[i] += arr[i][j];
				csum[i] += arr[j][i];
				if(i == j)
					pdsum += arr[i][j];
				else
					npdsum += arr[i][j];
			}
		}
		
		for(int i=0; i<n; i++)
		{
			if(!(rsum[i] == csum[i] && rsum[i] == pdsum && rsum[i]== npdsum && csum[i] == pdsum && csum[i]== npdsum && pdsum == npdsum))
			{
				magic = false;
				break;
			}
			/*else
			{
				magic = false;
				break;
			}*/
		}
		
		if(magic == true)
			System.out.println("Magic Square");
		else
			System.out.println("Not a Magic Square");
	}
}