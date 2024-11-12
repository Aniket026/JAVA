
import java.util.*; 
public class Car 
{
public int carspeed(int percentage)              
{
    int sum=0;
    for(int i=1;i<=percentage;i++){
      if(percentage%i==0 ){
        sum=sum+i;
      }
    }
    return sum;
}

    public static void main(String[] arg)
    {
      Car obj =new Car();
        Scanner sc= new Scanner(System.in);
        int percentage;
        System.out.println("Enter the percentage of battry ");
        percentage=sc.nextInt();
        int result=obj.carspeed(percentage);
        System.out.println(result); 

    }
    
}



