import java.util.Scanner;
import java.util.Arrays;

class menu1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine(), str2;
        while (true) {
            System.out.println("\n\nMENU\n1.Palindrome\n2.Alphabetical Order\n3.Reverse\n4.Add Reversed String\n5.Exit\n\nEnter your choice: ");
            int res = sc.nextInt();
            if (res == 1) {
                StringBuffer str1 = new StringBuffer(str);
                str1.reverse();
                str2 = str1.toString();
                if (str.equals(str2)) {
                    System.out.println("It IS a palindrome...");
                } else {
                    System.out.println("It is NOT a palindrome...");
                }
            } else if (res == 2) {
                char ch[] = str.toCharArray();
                Arrays.sort(ch);
                System.out.print("Alphabetically Sorted: ");
                System.out.println(new String(ch));
            } else if (res == 3) {
                StringBuffer str1 = new StringBuffer(str);
                System.out.println("Reversed String: " + str1.reverse());
            } else if (res == 4) {
                StringBuffer str1 = new StringBuffer(str);
                System.out.println("Added: " + (str + str1.reverse()));
            } else if (res == 5) {
                break;
            }
        }
        sc.close();
    }
}