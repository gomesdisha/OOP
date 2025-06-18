import java.util.Scanner;
class book{
    String title;
    String author;
    int edition;
    book(){
        title=" ";
        author=" ";
        edition=0;
    }
    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Title for Book: ");
        title=sc.nextLine();
        System.out.println("Enter Author for Book: ");
        author=sc.nextLine();
        System.out.println("Enter Edition for Book: ");
        edition=sc.nextInt();
        sc.close();
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Edition: "+edition);
    }
}

class auth{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of objects: ");
        int n=sc.nextInt();
        book b[]=new book[n];
        for(int i=0;i<n;i++){
            b[i]=new book();
            b[i].read();
        }
        for(int i=0;i<n;i++){
            if (b[i].author.equals("Harry") || b[i].author.equals("harry"))
            b[i].display();
        }
        sc.close();
    }
}