public class Fibonacci {

public int fibonacci1(int n){
    int first=0;
    int second=1;
    int number=first+second;
    for (int i=0;i<n;i++){
        1
        System.out.print(first+ " ");
        System.out.print(second+" ");
        
        number=number+(number+1);
        System.out.print(number+" ");
        
    }
    return 0;

}
    
public static void mian(String[] args){
    Fibonacci f1= new Fibonacci();
    f1.fibonacci1(4);
}
}
