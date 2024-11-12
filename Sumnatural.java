
import java.util.*; 
public class Sumnatural 
{
public int sum(int num){

int sum=0;
for(int i=0;i<num+1;i++){
    sum=sum+i;
}

return sum;
}

    public static void main(String[] arg)
    {
        Sumnatural obj =new Sumnatural();
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter number : ");
        num=sc.nextInt();
        int result=obj.sum(num);
        System.out.println("Sum of all natural numbaer : "+ result);

    }
    
}

