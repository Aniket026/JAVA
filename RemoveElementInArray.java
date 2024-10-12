

class RemoveElementInArray
 {
    public int[] remove(int[] arr,int val){
        int ptr=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[ptr]=arr[i];
                ptr++;

            }
        }
        return arr;
    }

    public static void main(String [] args){
        RemoveElementInArray obj1= new RemoveElementInArray();
        int [] arr={1,2,2,3,4,5};
        int[] result= obj1.remove(arr,2);
       
        for(int i=0;i<result.length;i++){
            System.err.print(result[i]);
        }
    }
    
}
