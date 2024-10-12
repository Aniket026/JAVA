public class FindmissingNumber {
    
    public int FindNumber(int[] arr){
        int arrsum=0;
        for(int i=0;i<arr.length;i++){
            arrsum+=arr[i];

        }

        int fulsum=0;
        for(int i=1;i<arr.length+2;i++){
            fulsum+=i;

        }
        return fulsum-arrsum;
        
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,5};
        FindmissingNumber f1=new FindmissingNumber();
        System.out.println("missing number : "+f1.FindNumber(arr));
        
    }
}
