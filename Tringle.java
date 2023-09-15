import java.util.*;
public class Tringle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first side : ");
        int a = scn.nextInt();
        System.out.println("Enter second side : ");
        int b = scn.nextInt();
        System.out.println("Enter third side : ");
        int c = scn.nextInt();

        if(a==b && b==c)
        {
            System.out.println("Equilateral");
        }

        else if (a==Math.sqrt(b*b + c*c) || b == Math.sqrt(a*a + c*c) || c == Math.sqrt(a*a + b*b))
        {
            System.out.println("Right-angled");
        }

        else if (a==b || a==c || b==c)
        {
            System.out.println("Isoscelen");
        }

        else
        {
            System.out.println("Scalen");
        }

    }
}
