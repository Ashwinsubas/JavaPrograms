public class StaticObject {

    int a=10;

    static int b=20;
    public static void main(String hai[])
    {
        StaticObject h=new StaticObject();
        System.out.println(h.a);

        h.a=100;
        h.b=200;

        System.out.println(h.b);

    }
    
}
