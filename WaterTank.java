
import java.util.*; 
public class WaterTank 
{
public double calwater(double  h,double  r)              
{
    double pai=3.14;
    double result=pai*r*r*h;
    return  result;
}

    public static void main(String[] arg)
    {
        WaterTank obj =new WaterTank();
        Scanner sc= new Scanner(System.in);
        double h,r;
        System.out.println("Enter the hight ");
        h=sc.nextInt();
        System.out.println("Enter the redius ");
        r=sc.nextInt();
        double result=obj.calwater(h,r);
        System.out.println((int) Math.round(result));


    }
    
}



