import java.util.Scanner;

public class Array {

    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a array limit");

        int limit = s.nextInt();

        int[] arr1 = new int[limit];
        System.out.println("Enter values to array");

        for(int i=0;i<limit;i++)
        {
            arr1[i] = s.nextInt();
        }

        System.out.print("Values in array are : ");

        for(int i=0;i<limit;i++)
        {
            System.out.print(" "+arr1[i]);
        }
    }
    
}
