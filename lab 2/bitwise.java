import java.util.Scanner;
public class bitwise{
    public static void main(String args[])
    {
        int a,mul,div ;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number");
        a = inp.nextInt();
        mul= a<<1;
        div= a>>1;
        System.out.println("The multiplied value of a by 2 is "+mul);
        System.out.println("The divided value of a by 2 is "+div);
        
    }
}