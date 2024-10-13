
import java.util.ArrayList;



public class Bulpon {

    public int[] findbulp(int n){
        ArrayList<Integer> newarr =new ArrayList<>();
        
        int i=0;
        while(i*i<=n){
            
            i++;
            newarr.add(i*i);
        }

        int[] result = new int[newarr.size()];
        for (int j = 0; j < newarr.size(); j++) {
            result[j] = newarr.get(j);
        }
        return  result;
      
    }
    

    public static void main(String[] args) {
        
        Bulpon b1=new Bulpon();
        int n=14;
    
        int[] result=b1.findbulp(n);
        for(int i=0;i<n;i++){
            System.out.println(result[i]+" ");
        }
    }
}
