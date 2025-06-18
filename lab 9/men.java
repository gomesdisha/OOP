import java.util.Scanner;

class men {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1 and string2: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        while (true) {
            System.out.println("\n\nMENU\n1. Compare\n2. Case Inverter\n3. Substring Check\n4. Replace\n5. Exit\n\nEnter your choice: ");
            int res = sc.nextInt();
            sc.nextLine();  // To consume the newline character after nextInt()

            if (res == 1) { // Option 1: Compare Strings
                if (str1.compareTo(str2) == 0) {
                    System.out.println("EQUAL");
                } else if (str1.compareTo(str2) < 0) {
                    System.out.println("STRING-1 IS SMALLER");
                } else {
                    System.out.println("STRING-1 IS GREATER");
                }
            }

            else if (res == 2) { // Option 2: Case Inverter
                System.out.println("Inverted String1:");
                for (int i = 0; i < str1.length(); i++) {
                    char ch = str1.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        System.out.print(Character.toLowerCase(ch));
                    } else {
                        System.out.print(Character.toUpperCase(ch));
                    }
                }
                System.out.println();

                System.out.println("Inverted String2:");
                for (int i = 0; i < str2.length(); i++) {
                    char ch = str2.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        System.out.print(Character.toLowerCase(ch));
                    } else {
                        System.out.print(Character.toUpperCase(ch));
                    }
                }
                System.out.println();
            }

            else if (res == 3) { // Option 3: Substring Check
                if (str1.contains(str2)) {
                    System.out.println("String2 is a substring of String1");
                } else if (str2.contains(str1)) {
                    System.out.println("String1 is a substring of String2");
                } else {
                    System.out.println("Not a substring");
                }
            }

            else if (res == 4) { // Option 4: Replace String
                if (str1.contains(str2)) {
                    str1 = str1.replace(str2, "Hello");
                    System.out.println("String1 after replacement: " + str1);
                } else if (str2.contains(str1)) {
                    str2 = str2.replace(str1, "Hello");
                    System.out.println("String2 after replacement: " + str2);
                } else {
                    System.out.println("No substring to replace");
                }
            }

            else if (res == 5) { // Option 5: Exit
                break;
            }

            else {
                System.out.println("Invalid choice! Please select a valid option.");
            }
        }

        sc.close();
    }
}
