import java.util.*;

public class Gcd {

    public static int gcd(int num1, int num2)
    {
        int a,b,temp;

        while(num2!=0)
        {
            temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number => ");
        int num1 = sc.nextInt();
        System.out.print("Enter secong Number => ");
        int num2 = sc.nextInt();

        System.out.println("GCD is => " + (gcd(num1, num2)));
    }
}
