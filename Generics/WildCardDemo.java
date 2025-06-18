import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {

    // Generic method that uses a wildcard
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        System.out.println("Integer List:");
        printList(intList);

        System.out.println("String List:");
        printList(strList);
    }
}
