class Prime{
 
    int num;
    Prime(){
        System.out.println("The code for Prime number ");
    }
    public int checkprime(){   
        if (num<=1){
            return  1;
        }
        for(int i=2;i<=num/2;i++)
        {
            if(num %i==0)
            {
                return 1;
            }
            
        }
        return 0;
    }
    public void display(){
        if (checkprime()==1){
            System.out.println("Not prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}

public class Constructor_1{
    public static  void  main(String[] args){
        Prime prime1= new Prime();
        prime1.num=12;

        prime1.display();

    }
}