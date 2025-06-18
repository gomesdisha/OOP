import java.util.Scanner;
class Box
{
    private double w,h,d;
   double vol;
    public Box(double w,double h,double d)
    {
        this.w=w;
        this.h=h;
        this.d=d;
    }
     public double vol()
    {
        System.out.println("inside vol");
        vol= (w*h*d);
        return vol;
    }
}
public class eg
{    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width,height and breadth");
       double wid = sc.nextDouble(), height=sc.nextDouble(),dep=sc.nextDouble();
        Box b1= new Box(wid, height, dep);
        double v= b1.vol();
        System.out.println("the volume is "+v);
        sc.close();
    }
}