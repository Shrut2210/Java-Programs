import java.util.Scanner;

public class Cgpi 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter first mark ");
        float a = x.nextFloat();
        System.out.println("Enter second mark ");
        float b = x.nextFloat();
        System.out.println("Enter third mark ");
        float c = x.nextFloat();

        float cgpi = (a+b+c)/30;
        System.out.println(cgpi);
    }
}
