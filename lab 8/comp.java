import java.util.Scanner;

interface Company {
    static final String s = "Dell";
    public void total();
}

class Software implements Company {
    String os;
    String type;
    int sales;

    Software(int s, String c, String m) {
        sales = s;
        type = m;
        os = c;
    }

    public void total() {
        System.out.println("Total Sales: " + sales);
    }
}

class Hardware implements Company {
    String ctgry;
    String manuf;
    int sales;

    Hardware(int s, String c, String m) {
        sales = s;
        manuf = m;
        ctgry = c;
    }

    public void total() {
        System.out.println("Total Sales: " + sales);
    }
}

class comp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hardware or Software (H/S)?");
        char ch = sc.next().charAt(0);

        if (ch == 'H') {
            System.out.println("Enter sales, manufacturer, category: ");
            int s = sc.nextInt();
            String m = sc.nextLine();
            m = sc.nextLine();
            String c = sc.nextLine();
            Hardware h = new Hardware(s, m, c);
            h.total();
        } else 
        {
            System.out.println("Enter sales, type, OS: ");
            int s = sc.nextInt();
            String t = sc.nextLine();
            t = sc.nextLine();
            String o = sc.nextLine();
            Software soft = new Software(s, t, o);
            soft.total();
        }
        sc.close();
    }
}