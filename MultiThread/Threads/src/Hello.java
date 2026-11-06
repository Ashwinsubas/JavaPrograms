public class Hello {

    public static void main(String[] args) {
        SampleThread s=new SampleThread();
        s.start();
        SampleThread s1=new SampleThread();
        s1.start();
        SampleThread s2=new SampleThread();
        s2.start();
    }
    
}
