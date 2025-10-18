package classobject;

public class PrintValue {
    public static void main (String ar[])
    {
        Sample s1=new Sample();
        Sample s2=new Sample();
        s1.a=10;
        s2.b=20;
        s1.b=30;
        s2.a=40;

        System.out.println("s1.a : "+s1.a+"s2.b : "+s2.b+"s1.b : "+s1.b+"s2.a : "+s2.a);
    }
    
}
