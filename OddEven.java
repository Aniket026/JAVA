
import java.util.Scanner;


class Even{

    int n;
    public void check(){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }

    }
   
}

class Student{
      String name;
      int marks;
      int marks4;
      int avgq ;
      
    public void list()
{
    avgq= marks+ marks4)/2 ;
    System.out.println("Name of Student" + this.name);
    System.out.println("Name of marks" + this.marks);
    System.out.println("Name of dept " + this.marks4);
     System.out.println("Avarage marks of Student  " + avgq);


}}

public class OddEven{
    public static void main(String[] args) {
        Even even1 =new Even();
        even1.n=8;
        
        Student stud1 = new Student();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of student ");
        stud1.name = sc.nextLine();
        System.out.println("Enter the name of marks ");
        stud1.marks= sc.nextInt();

        System.out.println("Enter the name of marks 2 ");
        stud1.marks4 = sc.nextInt();

        stud1.list();
        even1.check();
    }
}