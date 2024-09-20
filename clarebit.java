import java.util.*;

/* 
public class getbit {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=4;
        int pos=2;
        int bitmask=1<<pos;
       if((bitmask & n)==0){
        System.out.println("0");
       }
       else{
        System.err.println("0");
       }
    }
}



public class setbit {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=10;
        int pos=0;
        int bitmask=1<<pos;
        int new_number=bitmask | n;
        System.out.println(new_number);
    }
}

*/


public class clarebit {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=10;
        int pos=0;
        int bitmask=1<<pos;
        int notbitmask= ~(bitmask);
        int new_number=notbitmask & n; 
        System.out.println(new_number);
    }
}
