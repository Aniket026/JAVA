
import java.util.*; 
public class Totalque 
{
public int calque(int time)              
{
int problem=0;
int i=1;
int requirdtime=time;
       while(requirdtime>=0)
       {
        int problemtime=5*i;
        requirdtime=requirdtime-problemtime;
        problem ++;
        i++;
       }
       return problem-1;
}
    public static void main(String[] arg)
    {
       Totalque obj =new Totalque();
        Scanner sc= new Scanner(System.in);
        int time;
        System.out.println("Enter the time ");
        time=sc.nextInt();
        int result=obj.calque(time);
        System.out.println(result); 

    }
    
}

