import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {

    // Generic method to swap two elements in an array
    public static <T> void swap(T[] array, int index1, int index2) {
        // Check if indices are valid
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        // Swap elements
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Create an array of String for user input
        String[] array = new String[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        System.out.println("Original array: " + Arrays.toString(array));

        // Get indices to swap
        System.out.print("Enter the first index to swap: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter the second index to swap: ");
        int index2 = scanner.nextInt();

        try {
            swap(array, index1, index2);
            System.out.println("Array after swap: " + Arrays.toString(array));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
