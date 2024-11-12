 import java.util.*; 
public class Clock {

    public int find_time(int first,int second){
        int mul=first*second;

        int result=mul%12;
        if (result==12){
            return 0;
        }
        return result;
    
    }


    public static void main(String[] arg){
        Clock obj =new Clock();
        Scanner sc= new Scanner(System.in);
        int first,second;
        System.out.println("Enter the value of first");
        first=sc.nextInt();
        System.out.println("Enter the value of second");
        second=sc.nextInt();
        int result=obj.find_time(first,second);
        System.out.println(result);

    }
    
}
