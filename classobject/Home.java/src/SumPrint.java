import java.util.Scanner;

public class SumPrint {
    
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two value for object 1 : ");
        int num1=s.nextInt();
        int num2=s.nextInt();
        System.out.println("Enter two value for object 2 : ");
        int num3=s.nextInt();
        int num4=s.nextInt();
        
        SumMain obj1=new SumMain();
        SumMain obj2=new SumMain();

        obj1.ObjectSum(num1,num2);
        obj1.display();

        obj2.ObjectSum(num3, num4);
        obj2.display();
    }
}
