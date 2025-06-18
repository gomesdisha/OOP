import java.util.Scanner;
class count {
    static int cnt;
    public count()
    {
        cnt++;
    }
}
class countobj { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n\nMENU\n1.Create Object\n2.Display Count\n3.Exit\n\nEnter your choice: ");
            int ch = sc.nextInt();
            if (ch == 1) 
            {
                count c = new count();
                System.out.println(c.getClass());
            }
             else if (ch == 2) 
             {
                System.out.println("Number of objects created: " + count.cnt);
            } 
            else 
            {
                break;}
            }
        sc.close();}}