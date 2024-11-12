
import java.util.*; 
public class Dogage 
{
public int calage(int age)
{
    int doginhumangae=age*7;
    return doginhumangae;
}

    public static void main(String[] arg)
    {
        Dogage obj =new Dogage();
        Scanner sc= new Scanner(System.in);
        int dogage;
        System.out.println("Enter the age of dog ");
        dogage=sc.nextInt();
        int result=obj.calage(dogage);
        System.out.println("Age of dog ini human form : "+ result);

    }
    
}
