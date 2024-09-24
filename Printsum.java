
import java.util.Scanner;

/* 
public class printnnumber{
    public static void fun(int n){
        if (n==6){
            return;
        }
        System.out.println(n);
        fun(n+1);

    }
    public static void main(String[] args) {
        int n=1;
        fun(n);
    }
    
    
}

*/

import java.util.*;

public class Printsum{
    public static void fun(int i,int n,int sum){
        if (i==n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        fun(i+1,n,sum);

    }
    public static void main(String[] args) {
       fun(1,6,0);
      
    }
    
    
}



class Recursion1 {
    public static void printFactorial(int a, int b, int n) {
    if(n == 0) {
    return;
    }
    System.out.println(a);
    printFactorial(b, a+b, n-1);
    }
    public static void main(String args[]) {
    printFactorial(0, 1, 5);
    }
    }