public class Candycount {
    public int fidndcandy(int[] arr,int candy, int money){
        int count=0;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] % 5 == 0) {
                count++; 
        }

        else{
            if(money>=arr[i]){
                count++;
                money=money-arr[i];
         }
        }
    }
        return count;
    }

    public static void  main(String[] arg){

        Candycount obj =new Candycount();
        int[] arr={5,5,105,9,11};
        int money=18;
        int candy=5;
        int result=obj.fidndcandy(arr,candy,money);
        System.out.println(result);
    }
    
}
