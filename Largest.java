import java.util.Scanner;

public class Largest
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = num.nextInt();
        System.out.println("Enter second number : ");
        int b = num.nextInt();
        System.out.println("Enter third number : ");
        int c = num.nextInt();

        int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("Largest is " + max);
    }
}