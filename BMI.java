import java.util.Scanner;

public class BMI
{
    public static void main(String[] args)
    {
        Scanner bmi = new Scanner(System.in);

        System.out.println("Enter value of height in inches : ");
        double h = bmi.nextDouble();
        h = h*0.0254;

        System.out.println("Enter value of weight in pound : ");
        double w = bmi.nextDouble();
        w = w*0.45359237;

        double total_bmi = w/(h*h);
        System.out.println(total_bmi);
    }
}