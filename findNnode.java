import java.util.*;

public class findNnode {


public static void main(String [] args){
   
LinkedList<Integer> list = new LinkedList<>();
list.addFirst(2);
list.addFirst(3);
list.addFirst(4);
list.addFirst(5);
list.addFirst(6);
Scanner sc =new  Scanner(System.in);
System.out.println("Enter the number which you want find ");
int input=sc.nextInt();
for(int i=0;i<list.size();i++)
{
    if(input==i){
         System.out.println();
    }}
    
for(int j=0;j<list.size();j++)
{
     System.out.print(list.get(j)+"->");
    
}
}



    
}
