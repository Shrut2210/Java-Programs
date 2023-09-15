import java.util.Scanner;

public class Diameter
{
    public static void main(String[] args)
    {
        Scanner area = new Scanner(System.in);

        System.out.println("Enter area of circle : ");
        double a = area.nextDouble();

        double d = Math.sqrt(a/3.14);

        System.out.println(d*2);
    }
}