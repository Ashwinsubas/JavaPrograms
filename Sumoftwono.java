import java.util.Scanner;

public class Sumoftwono {

    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first value");
        int num1=s.nextInt();
        System.out.println("Enter second number");
        int num2=s.nextInt();

        int sum = num1+num2;
        System.out.println("Sum is "+sum);
    }
    
}
