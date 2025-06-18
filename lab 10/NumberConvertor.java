import java.util.Scanner;

public class NumberConvertor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String ch;
        int n = 2; // Initialize n to 0 or any default value

        System.out.println("Enter a string:");
        ch = sc.nextLine();
        System.out.println("Trying to convert String to Number:");

        try
         {
            n = Integer.parseInt(ch); // Convert string to integer
        } catch (NumberFormatException e)
         {
            System.out.println("Number format error: " + e.getMessage());
            n = -1; // Optionally set a value indicating an error
        } finally {
            System.out.println(n);
        }

        sc.close(); // Close the scanner
    }
}


