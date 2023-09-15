import java.util.Scanner;

public class Marks{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter total marks of subject :");
        float total = x.nextFloat();
        System.out.println("Enter First sub mark :");
        float a = x.nextFloat();
        System.out.println("Enter Second sub mark :");
        float b = x.nextFloat();
        System.out.println("Enter Third sub mark :");
        float c = x.nextFloat();
        System.out.println("Enter forth sub mark :");
        float d = x.nextFloat();
        System.out.println("Enter fifth sub mark :");
        float e = x.nextFloat();

        float y = ((a+b+c+d+d+e)*100)/total;
        System.out.println(y);

    }
}