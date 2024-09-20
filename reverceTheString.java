
import java.util.Scanner;

public class reverceTheString {

    public static void main(String[] args) {
        
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the string : ");
    String input=sc.nextLine();
    StringBuilder str =new StringBuilder (input) ;

    for(int i=0;i<str.length()/2;i++){
        int front=i;
        int back= str.length()-1-i;

        char frontchar=str.charAt(front);
        char backchar=str.charAt(back);

        str.setCharAt(front, backchar);
        str.setCharAt(back, frontchar);

 
    }
    System.out.print("Reverce String : " + str);


    }
    
}
