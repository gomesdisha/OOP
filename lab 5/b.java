import java.util.Scanner;

class Box {
    private double w, h, d;
    
    public Box(double w, double h, double d) {
        this.w = w;
        this.h = h;
        this.d = d;
    }

    public double volume() {
        double vol = w * h * d;
        return vol;
    }
}

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width, height, and depth: ");
        double wid = sc.nextDouble(), hgt = sc.nextDouble(), dep = sc.nextDouble();
        
        Box b1 = new Box(wid, hgt, dep);
        double v = b1.volume();
        System.out.println("Volume = " + v);
        
        sc.close();
    }
}
