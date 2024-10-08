public class Fibonacci1 {

    public int fib(int n){
        int first=0;
        int second=1;

        for(int i=1;i<=n;i++){
            int third=first+second;
            first=second;
            second=third;
        }
       return first;

    }

    public static void main(String[] args) {
        Fibonacci1 f1 =new Fibonacci1();
        int r=f1.fib(6);
        System.out.println(r);
    }
    
}
