import java.util.Scanner;

class NegativeRootException extends Exception{
    public String toString(){
        return "Imaginary Roots";
    }
}

class Negative{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        try{
            int num=sc.nextInt();
            if(num<0){
                sc.close();
                throw new NegativeRootException();
            }
            double root=Math.sqrt(num);
            System.out.println("\nSquare Root: "+root);
            sc.close();
        }
        catch(NegativeRootException e){
            System.out.println(e);
        }
    }
}