class Para{
    String name;
    int  marks;

    public void diplay(){
        System.out.println(name);
        System.out.println(marks);

        if (marks>45){
            System.out.println("good");
        }
    }
    Para(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }
}

public class parameterzied_constructor{
    public static void main(String[] args) {
        Para p1=new Para("aniket",89);
        p1.diplay();
    }

}