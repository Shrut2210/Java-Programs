import java.util.Scanner;

public class Feet
{
    public static void main(String[] args)
    {
        Scanner feet = new Scanner(System.in);

        System.out.println("Enter value in meter : ");
        double m = feet.nextDouble();

        double f = m*3.28;
        System.out.println(f);
    }
}