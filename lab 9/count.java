import java.util.Scanner;

class count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int v = 0;
        System.out.println("Total number of characters: " + str.length());
        String s[]=str.split(" ");
        for (int w = 0; w < str.length(); w++) {
            if (str.charAt(w) == 'a' || str.charAt(w) == 'e' || str.charAt(w) == 'i' || str.charAt(w) == 'o'
                    || str.charAt(w) == 'u') {
                v++;
            }
        }
        System.out.println("Total number of words: " + s.length);
        System.out.println("Total number of vowels: " + v);
        sc.close();
    }
}