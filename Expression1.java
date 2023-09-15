import java.util.Scanner;

public class Expression1 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter value for v");
        int v = x.nextInt();
        System.out.println("Enter value for u");
        int u = x.nextInt();
        System.out.println("Enter value for a");
        int a = x.nextInt();
        System.out.println("Enter value for s");
        int s = x.nextInt();

        float y = (float)((v*v - u*u)/(2*a*s));
        System.out.println(y);
    }
}
