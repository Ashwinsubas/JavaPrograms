import java.util.Scanner;

public class IfSample {
    
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check positive or negative");
        int num=s.nextInt();
        if(num>0)
        {
            System.out.println(num+" is positive");
        }
        else{
            System.out.println(num+" is negative");
        }
    }
}
