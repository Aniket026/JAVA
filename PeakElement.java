public class PeakElement {

    public int findpeak(int[] arr){

        if(arr.length==0){
            return 0;
        }
        else if(arr.length==1){
            return arr[0];
        }
        else if( arr[0]>arr[1]){
            return arr[0];
        }
        else if(arr.length-1>arr.length-2){
            return arr[arr.length-1];
        }

       
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]-1<arr[i] && arr[i]>arr[i+1]){
                return arr[i];
            }
            
        }
        return 0;
    }
    public static void main(String[] arg){
        PeakElement obj =new PeakElement();
        int[] arr={9,2,2,4,8};
        int result=obj.findpeak(arr);
        System.out.println(result);
    }
    
}
