import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a=s.nextInt();
        int b=s.nextInt();
        
        int result = sum(a,b);
        System.out.println("Sum is "+result);
    }

    static  int sum(int num1, int num2)
    {
        int sum = num1+num2;
        return sum;
    }
    
}
