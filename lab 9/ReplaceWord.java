import java.util.Scanner;

class ReplaceWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String key = "XOX";
        String str1 = "", str2;//?
        for (int i = 0; i < str.length(); i++) {
            str2 = Character.toString(str.charAt(i));
            if (str1.contains(str2)) {
                str1 = str1.concat(key);
            } else {
                str1 = str1.concat(str2);
            }
        }
        System.out.println("Word after replacing repeating characters: " + str1);
        sc.close();
    }
}