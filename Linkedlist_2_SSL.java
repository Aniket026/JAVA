
import java.util.*;
public class Linkedlist_2_SSL {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("n");
        list.addFirst("e");
        list.addLast("nk");
       

        list.remove(1);

        list.removeFirst();
        list.removeLast();

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
    } 
}
