import java.util.Scanner;
class Box{
    private double w,h,d;
    //double vol;

    public Box(double w,double h,double d )
    {
        this.w=w;
        this.h=h;
        this.d=d;
    }

    public double volume()
    {
       double vol=(w*d*h);
        //System.out.println("volume = "+vol);
        return vol;
    }
}
public class use{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter width, height and depth: ");
        double wid=sc.nextInt(),hgt=sc.nextInt(),dep=sc.nextInt();
       
        Box b1=new Box(wid,hgt,dep);
        double v = b1.volume();
        System.out.print("volume = "+v);
        sc.close();
    }
}