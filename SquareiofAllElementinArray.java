public class SquareiofAllElementinArray {

    public int[] squar(int[] arr){
        int [] ans =new int[arr.length];
        int start=0;
        int end=arr.length-1;
        int ptr=arr.length-1;
       while(start<=end){
        int ss=arr[start]*arr[start];
        int es=arr[end]*arr[end];
        if(ss>es){
            ans[ptr]=ss;
            start++;

        }
        else{
        ans[ptr]=es;
        end--;

        }
        ptr--;
       }
       return ans;
    }
    public static void main(String[] args) {
        SquareiofAllElementinArray obg=new SquareiofAllElementinArray();
        int[] arr={-5,-2,1,3,4};
        int[] result=obg.squar(arr) ;
        for(int i=0;i<result.length;i++){
            System.err.print(result[i]+" ");
        }
    }
    
}
