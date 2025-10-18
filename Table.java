import java.util.Scanner;

public class Table {

    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to print the multiplication table");

        int num=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" * "+num +" = "+i*num);
        }
    }
    
}
