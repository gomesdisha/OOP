class GenericList<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class ListDemo {
    public static void main(String[] args) {
        GenericList<Integer> intList = new GenericList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.print("Integer List: ");
        intList.display();

        GenericList<Double> doubleList = new GenericList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        System.out.print("Double List: ");
        doubleList.display();
    }
}
