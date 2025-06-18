import java.util.Scanner;

class prg1 {
    String name;
    String marks;
    String roll;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, roll number and marks");
        name = sc.nextLine();
        marks = sc.nextLine();
        roll = sc.nextLine();
        int a = Integer.parseInt(marks);
        int b = Integer.parseInt(roll);
        int c = a + b;
        a=c;
        sc.close();
    }

    void display() {
        System.out.println("name: " + name + " roll no:" + roll + " marks:" + marks);
    }
}

class lo {
    public static void main(String args[]) {
        try {
            prg1 p[] = new prg1[3];
            for (int i = 0; i < 3; i++) {
                p[i] = new prg1();
                p[i].input();
            }
            for (int i = 0; i < 3; i++) {
                p[i].display();
            }
        }

        catch (NumberFormatException e) {
            System.out.println("DETECTING");
        }
    }
}