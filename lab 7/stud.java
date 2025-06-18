
import java.util.Scanner;
class Student {
    String name;
    final String college;
    String id;
    public Student(String n, String id) {
        name = n;
        this.id = id;
        college = "MIT";
        }
    void display_details() {
        System.out.println(""+name + " from " + college + " has ID: " + id);}}

class stud {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of students");
     int num=sc.nextInt();
     sc.nextLine();
     //used to consume the next line while entering name (enter)id
     for(int i=1;i<=num;i++)
     {
        System.out.println("Enter Name and ID: ");
        String name = sc.nextLine();
        String id = sc.nextLine();
        Student member = new Student(name, id);
        member.display_details();
     }
     
        sc.close();}}
