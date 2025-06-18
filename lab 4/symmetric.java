import java.util.Scanner;

public class symmetric {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i, j, n, flag = 0;
    int arr[][] = new int[100][100];
    System.out.println("enter the size of the square matrix");
    n = sc.nextInt();
    System.out.println("enter the square matrix");
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        if (arr[i][j] != arr[j][i]) {
          flag = 1;
          break;
        }
      }
    }
    if (flag == 0) {
      System.out.println("it is SYMMETRIC");
    } else
      System.out.println("it is NOT SYMMETRIC");
    // break;
    // }

  }
}