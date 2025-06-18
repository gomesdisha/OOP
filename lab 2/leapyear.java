
import java.util.Scanner;
public class leapyear{
    public static void main(String args[])
    {
        int year;
        boolean value=false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = sc.nextInt();
        if((year%400==0 | year%100!=0) & year%4==0 )
        {
            value= true;
        }
       else
        if(year%4!=0 | year%100==0)
        {
            value = false;
        }     
    if(value)
    {
        System.out.println("It is a leap year");
    }
    else
    {
        System.out.println("It is a common year");
    }
    sc.close();
     }

}