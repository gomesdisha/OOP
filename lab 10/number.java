import java.util.Scanner;
public class number
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String ch;
    int n=1;
    System.out.println("Enter a string\n");
    ch=sc.nextLine();
    System.out.println("Trying to convert String to Number:\n");
    try 
    {
        n=Integer.parseInt(ch);
    } catch (NumberFormatException e)
    {
        System.out.println("Number format error\n");
        // TODO: handle exception
    }
    finally
    {
        System.out.println(n);
    }
}
}