import java.util.*;
/* public class Array_1 
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array :");
    int size=sc.nextInt();
    int newMarks[]=new int[size];

    for(int j=0;j<size;j++){
        System.out.println("Enter the elements in array ");
        newMarks[j]=sc.nextInt();
    
    } 
    for(int j=0;j<size;j++){
        System.out.println(newMarks[j]);
    
    } 
    int[] marks =new int[4];
    marks[0]=78;
    marks[1]=79;
    marks[3]=90;
    //System.out.println(marks[0]);
    //System.out.println(marks[1]);
    //System.out.println(marks[2]);
    for (int i=0;i<4;i++){
        System.out.println(marks[i]);
    }

}
}

public class Search{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();

        int newarray[] =new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the number "+i + " :");
            newarray[i]=sc.nextInt();
        }
        System.out.print("Enter the number which you want find : ");
        int number=sc.nextInt();

        for(int i=0;i<size;i++){
            if(newarray[i]==number){
                System.out.println(i);
                break;
            }
           
        }

    }
}





public class minmax{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();

        int newarray[] =new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the number "+i + " :");
            newarray[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<newarray.length;i++){
            if(newarray[i]<min){
                min=newarray[i];
            }
            if(newarray[i]>max){
                max=newarray[i];
            }
          
        }
        System.out.println("max number is"+ max);
        System.out.println("min number is"+ min);

       

    }
}





*/

