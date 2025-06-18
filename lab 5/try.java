import java.util.Scanner;
class Box{
    double width,height,depth;
   double vol;
    Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
     public double vol()
    {
        System.out.println("inside vol");
        vol= (width*height*depth);
        return vol;
    }
}
public class try
{
    public static void main(String args[])
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