public record AdditionTwoNum() {
    
    public static int[] add(int[] args,int target){
           int[] result =new int[2];
        for (int i=0;i<args.length;i++){
            for (int j=i+1;j<args.length;j++)
            {
                if(args[j]+args[i]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                    
                }
            }
        }
        return result;
    }

    public static void main(String [] args){
        int[] arr={1,2,3,4,5};

        int[] newr =AdditionTwoNum.add(arr,8);
        System.out.println(newr[0]+" "+newr[1]);
    }

}
