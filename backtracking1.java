import java.util.*;

public class backtracking1 {
  static  int count=0;

  public static void permutation(String str,int id,String perm) {
    if(str.length()==0){

      System.out.println(perm);
      count++;
    }

    for(int i=0;i<str.length();i++){
      char currentchar=str.charAt(i);
      String newString=str.substring(0,i)+str.substring(i+1);

      permutation(newString, id+1,perm +currentchar);
    }
      
  }
public static void main(String[] args) {

  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the string ");
  String str= sc.nextLine();

  permutation(str, 0, "");
  System.out.println("Number of permutation " +count);

}
}



