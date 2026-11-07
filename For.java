import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a limit");
        int limit=s.nextInt();
        int sum=0;
        for(int i=1;i<=limit;i++)
        {
             sum+=i;
        }
        System.out.println("Sum of numbers is "+sum);
    }
    
}
