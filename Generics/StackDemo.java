import java.util.ArrayList;

class GenericStack<T> {
    private ArrayList<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "'}";
    }
}

public class StackDemo {
    public static void main(String[] args) {
        GenericStack<Student> studentStack = new GenericStack<>();
        studentStack.push(new Student("Alice"));
        studentStack.push(new Student("Bob"));

        System.out.println("Popped from student stack: " + studentStack.pop());

        GenericStack<Employee> employeeStack = new GenericStack<>();
        employeeStack.push(new Employee("Charlie"));
        employeeStack.push(new Employee("Diana"));

        System.out.println("Popped from employee stack: " + employeeStack.pop());
    }
}
