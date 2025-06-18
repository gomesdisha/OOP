import java.util.Scanner;
class Account{
    String custName;
    int accno;
    int min;
    double bal;
    double interest;
    double fin;
    Scanner sc=new Scanner(System.in);
    Account(){
        min=5000;
        bal=0;
        interest=0.06;
    }
    void deposit(){
        System.out.print("How much amount do you want to deposit?\n");
        int dep=sc.nextInt();
        fin+=dep;
        if (fin<5000){
            System.out.println("Service Tax Applied");
            bal-=(bal*0.05);
            return;
        }
        return;
    }
    void withdraw(){
        System.out.print("How much amount do you want to withdraw?\n");
        int wit=sc.nextInt();
        fin-=wit;
        if (fin<5000){
            System.out.println("Service Tax Applied");
            bal-=(bal*0.05);
        }
        return;
    }
}

class savings extends Account{
    void deposit(){
        System.out.print("How much amount do you want to deposit?\n");
        int dep=sc.nextInt();
        bal+=dep;
        fin=bal+(bal*0.06);
        if (fin<5000){
            System.out.println("Service Tax Applied");
            fin-=(bal*0.05);
        }
    }

    void display(){
        System.out.println("Your balance is : "+fin);
    }
}

class current extends Account{
    void display(){
        System.out.println("Your balance is : "+fin);
    }
}

class lmao{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);        
        String type;
        System.out.println("Type? ");
        type=sc.nextLine();
        char res='y';
        if (type=="savings"){
            savings s=new savings();
            while(res=='y'){
                System.out.println("\n\nMENU\n1.Deposit\n2.Display\n3.Withdraw\n4.Exit\n\nEnter choice: ");
                int ch=sc.nextInt();
                if (ch==1){
                    s.deposit();
                }
                else if (ch==2){
                    s.display();
                }
                else if (ch==3){
                    s.withdraw();
                }
                else{
                    break;
                }
                System.out.println("Do you want to continue?");
                res=sc.next().charAt(0);
            }
        }
        else{
            current c=new current();
            System.out.println("\n\nMENU\n1.Deposit\n2.Display\n3.Withdraw\n4.Exit\n\nEnter choice: ");
            while(res=='y'){
                int ch=sc.nextInt();
                if (ch==1){
                    c.deposit();
                }
                else if (ch==2){
                    c.display();
                }
                else if (ch==3){
                    c.withdraw();
                }
                else{
                    break;
                }
                System.out.println("Do you want to continue?");
                res=sc.next().charAt(0);
            }
        }
        sc.close();
    }
}