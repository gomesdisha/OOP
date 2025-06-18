import java.util.Scanner;

interface Area {
    void computeArea();
}

class Triangle implements Area {
    int base, height;
    double area;

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    public void computeArea() {
        area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle implements Area {
    int radius;
    double area;

    Circle(int r) {
        radius = r;
    }

    public void computeArea() {
        area = 3.14 * Math.pow(radius, 2);
        System.out.println("Area of Circle: " + area);
    }
}

class Shape1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Triangle or Circle (T/C)?");
        char ch = sc.next().charAt(0);
        if (ch == 'T' || ch == 't') {
            System.out.println("Enter base and height: ");
            int l = sc.nextInt();
            int b = sc.nextInt();
            Triangle t = new Triangle(l, b);
            t.computeArea();
        } else {
            System.out.println("Enter radius: ");
            int r = sc.nextInt();
            Circle c = new Circle(r);
            c.computeArea();
        }
        sc.close();
    }
}