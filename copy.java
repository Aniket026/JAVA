


class Name{
     String name ;

    public void diplay(){
        System.out.println(name);
    }

    Name(Name n1){
        this.name= n1.name;
    }
    Name(){
        
    }
}


public class copy{
    public static void main(String[] args) {
        Name n1 = new Name();
        n1.name="Aniket";
        Name n2= new Name(n1);
        n2.diplay();

        
    }

}