import java.util.Scanner;

public class SumArray {

    public static void main(String ar[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the limit of array");
        int limit = s.nextInt();

        int[] values = new int [limit];
        System.out.println("Enter the values in array");
        for(int i=0;i<limit;i++)
        {
            values[i] = s.nextInt();
        }

        int sum=0;

        for(int i=0;i<limit;i++)
        {
             sum = sum+values[i];
        }

        System.out.println("Sum of elements in array :  "+sum);

    }
    
}
