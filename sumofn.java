import java.util.Scanner;

public class sumofn {
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to find sum");
        int num=s.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("Total: "+sum);

    }
}
