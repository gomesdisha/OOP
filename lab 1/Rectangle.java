public class Rectangle
{
 public static void main(String args[])
  {
    int length,breadth;
    length=Integer.parseInt(args[0]);
    breadth=Integer.parseInt(args[1]);
    int area=length*breadth;
    int circumference = 2*(length+breadth);
     System.out.println("length of the rectangle = "+length);
     System.out.println("breadth of the rectangle = "+breadth);
     System.out.println("area of the rectangle = "+area);
     System.out.println("circumference of the rectangle = "+circumference);
   }
}