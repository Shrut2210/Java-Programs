import java.util.Scanner;

public class SumOfThreeNum 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter first num ");
        int a = x.nextInt();
        System.out.println("Enter second num ");
        int b = x.nextInt();
        System.out.println("Enter third num ");
        int c = x.nextInt();

        int sum = a+b+c;
        System.out.println(sum);
    }
}
