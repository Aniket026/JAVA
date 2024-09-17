
import java.util.*;

/*import java.util.*;
public class functions{

    public static void MyName(String name){
        
        System.out.println("My name is " + name);
        return;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name =sc.nextLine();
        MyName(name);
    }

}



import java.util.*;
public class functions{
    public static int addnumber(int a , int b)
    {  
        int sum =a+b ;
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
         int sum= addnumber(a,b);
        System.out.println(sum);
    }

}



import java.util.*;
public class functions{
    public static int product(int a , int b)
    {  
        return a * b ;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int sum= product(a,b);
        System.out.println(sum);
    }

}



import java.util.*;
public class functions{
    public static void product(int a )
    {  
        if (a<0){
            System.out.println("invalid number ");
            return;
        }
        int factorial=1 ;
        for (int i=a;i>=1;i--){
            factorial=factorial*i;
        }
       System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        product(a);
    }

}
        
*/


public class prime{
    public static boolean  primeNumber(int a) {
        for(int i=2;i<a;i++)
        {
            if(a%i==0){
                return false ;
        
            }
        }
        return true;
      
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Boolean isprime=primeNumber(a);
        if(!isprime){
            System.out.println("not prime");
        }
       else{
        System.out.println("Prime");
       }

    }
}
