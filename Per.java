import java.util.Scanner;

public class Per
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter first sub marks : ");
        int a = num.nextInt();
        System.out.println("Enter second sub marks : ");
        int b = num.nextInt();
        System.out.println("Enter third sub marks: ");
        int c = num.nextInt();
        System.out.println("Enter forth sub marks: ");
        int d = num.nextInt();
        System.out.println("Enter fifth sub marks: ");
        int e = num.nextInt();

        double perce = (a+b+c+d+e)/5.0;
        System.out.println(perce);

        if(perce>70.0)
        {
            System.out.println("Distinction");
        }
        else if(perce<=70.0 && perce>60.0)
        {
            System.out.println("First Class");
        }
        else if(perce<=60.0 && perce>45.0)
        {
            System.out.println("Second Class");
        }
        else if(perce<=45.0 && perce>35.0)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}