 class A{
    public A()
{
    System.out.println("this is A");
}  
public A(int n){
    System.out.println("This id int A");
}  
}

 class B extends A{
    public B()
{
    System.out.println("This is B");
}
public B(int n){
    super(n);
    System.out.println("This id int B");
}
}

public class Demo{
    public static void main(String[] args) {
        B obj1=new B(3);
    }
    
}