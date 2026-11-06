public class Cons {
    
    public static void main(String ar[])
    {
        Sample s=new Sample(); //the name sample with () is the place where we call constrcutor
   
            Cons h=new Cons();
    }

     Cons() // when we set a constructor inside same file its name will be same as the class 
    {
        System.out.println("Inside the same program");
    }
}
