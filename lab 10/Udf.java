import java.util.Scanner;

class UdfError extends Exception {
    public UdfError() {
        super("ERROR DETECTED!!!");
    }
}

public class Udf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the option number: 1.Display error 2.Exit program");
        n = sc.nextInt();

        try {
            if (n == 1) {
                throw new UdfError();
            } else {
                System.out.println("Exiting program");
            }
        } catch (UdfError e) {
            System.out.println(e.getMessage()); // Print the error message
        } finally {
            sc.close(); // Close the scanner
        }
    }
}
