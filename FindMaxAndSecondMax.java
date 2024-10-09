

class FindMaxAndSecondMax {
    public int[] FindMax(int[] arr){
        int max=-1;
        int smax=-1;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                smax=max;
                max=arr[i];
            }
            else if(smax<arr[i]){
                smax=arr[i];
            }
        }
        int [] ans= new int[2];
        ans[0]=max;
        ans[1]=smax;

        /* 
        Withot creating array
        System.out.println("Max: " + max);
        System.out.println("Second Max: " + smax);
         */

        return ans;

        
    }
    public static void main(String[] args) {
   FindMaxAndSecondMax obj =new FindMaxAndSecondMax();
        int[] arr={1,2,3,4,5,6};
        int[] Result=obj.FindMax(arr);
        // obj.FindMax(arr);
        System.out.println("max :"+ Result[0]);
        System.out.println("Second max "+Result[1]);
    }
    
}
