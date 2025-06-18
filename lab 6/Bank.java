import java.util.Scanner;;
class Bank{
    double principle;
    double roi;
    double fin;
    double time;
    Bank(double p,double t){
        principle=p;
        time=t;
    }
}

class SBI extends Bank{
    SBI(double p,double t){
        super(p,t);
        roi=8;
    }
    double getRateOfInterest(){
        fin=((principle*roi*time)/100)+principle;
        return fin;
    }
}

class ICICI extends Bank{
    ICICI(double p,double t){
        super(p,t);
        roi=7;
    }
    double getRateOfInterest(){
        fin=((principle*roi*time)/100)+principle;
        return fin;
    }
}

class AXIS extends Bank{
    AXIS(double p,double t){
        super(p,t);
        roi=9;
    }
    double getRateOfInterest(){
        fin=((principle*roi*time)/100)+principle;
        return fin;
    }
}

class result{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Which bank?\n1.SBI\n2.ICICI\n3.AXIS\n\nEnter your choice: ");
        int ch=sc.nextInt();
        if (ch==1){
            System.out.println("Enter principle and time period: ");
            double p=sc.nextDouble();
            double t=sc.nextDouble();
            SBI s=new SBI(p,t);
            System.out.println("FINAL AMOUNT using SBI: "+s.getRateOfInterest());
        }
        else if (ch==2){
            System.out.println("Enter principle and time period: ");
            double p=sc.nextDouble();
            double t=sc.nextDouble();
            ICICI s=new ICICI(p,t);
            System.out.println("FINAL AMOUNT using ICICI: "+s.getRateOfInterest());
        }
        else if (ch==3){
            System.out.println("Enter principle and time period: ");
            double p=sc.nextDouble();
            double t=sc.nextDouble();
            AXIS s=new AXIS(p,t);
            System.out.println("FINAL AMOUNT using AXIS: "+s.getRateOfInterest());
        }
        else{
            System.out.println("INVALID OPTION");
        }
        sc.close();
    }
}