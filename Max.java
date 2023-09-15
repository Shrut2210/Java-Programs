
import java.util.*;

public class Max {

    public static void max(int a, int b)
    {
        if(a>b)
        {
            System.out.println("a is max");
        }
        else
        {
            System.out.println("b is max");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first num");
        int n = scn.nextInt();
        System.out.println("enter second num");
        int m = scn.nextInt();

        max(n,m);
    }
}
