 
import java.util.*; 
public class Arraydivd7 
{
public int calsum(int[] arr,int sizeodarry)              
{
    int product=1;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%7==0 && arr[i]>0){
        product=product*arr[i];
      }
    }
    return product;
}

    public static void main(String[] arg)
    {
        Arraydivd7 obj =new Arraydivd7();
        Scanner sc= new Scanner(System.in);
        int[] arr={0,7,3,4,5};
        int sizeodarry=arr.length;
        int result=obj.calsum(arr,sizeodarry);
        System.out.println(result);


    }
    
}



