


public class Maxtreenumberproduct1
{
    public int sort1(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int size=arr.length;
        int first=arr[0]*arr[1]*arr[size-1];
        int second=arr[size-1]*arr[size-2]*arr[size-3];
        if(first>second){
            return first;
        }
        return second;
    }
    public static void main(String[] arg)
    {
      Maxtreenumberproduct1 obj =new Maxtreenumberproduct1();
        int[] arr={-10,-10,3,2,1};
        int result=obj.sort1(arr);
        System.out.println(result);
       

    }
}




