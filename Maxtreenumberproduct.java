
import java.util.*; 
public class Maxtreenumberproduct 
{
public int maxproduct(int[] arr)              
{  
    int max=-1;
    int smax=-1;
    int tmax=-1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                tmax=smax;
                smax=max;
                max=arr[i];
            }
            else if(smax<arr[i]){
                tmax=smax;
                smax=arr[i];     
            }
            else{
                tmax=arr[i];
            }
        }
        return max*smax*tmax;
    
}

    public static void main(String[] arg)
    {
      Maxtreenumberproduct obj =new Maxtreenumberproduct();
        Scanner sc= new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        int result=obj.maxproduct(arr);
        System.out.println(result); 

    }
    
}



