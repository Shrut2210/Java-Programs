import java.util.Scanner;

public class PorN
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter number : ");
        int m = num.nextInt();

        if(m>=0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}