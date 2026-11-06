public class D extends C {

    int b;

    void display()
    {
        System.out.println("its d");
    }

    void show()
    {
        super.display();
    }
    
    public static void main(String ar[])
    {
        D s=new D();
        s.show();
    }
    
}
