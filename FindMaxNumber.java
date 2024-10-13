public class FindMaxNumber {

    public int Findmax(int[] arr){
        int max=0;
        int secondmax=0;
        int index=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                index=i;
                secondmax=max;
                max=arr[i];
            }
            else if(secondmax<arr[i] && arr[i] < max){
                secondmax=arr[i];
            } 

        }
        
          if(secondmax*2<max){
            return index;
           }
       else{
        return -1;
       }
          
    }

    public static void main(String [] args){
        FindMaxNumber obj= new FindMaxNumber();
        int[] arr={1,2,3,4,9};
        int maxIndex = obj.Findmax(arr);
        
       System.out.println(maxIndex);
}
}
