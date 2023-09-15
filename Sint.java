
import java.util.*;

public class Sint {

    public static float interest(int am, int y, float r)
    {
        return (am*y*r)/100;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter amount");
        int n = scn.nextInt();
        System.out.println("enter year ");
        int y = scn.nextInt();
        System.out.println("enter rate");
        float x = scn.nextFloat();

        System.out.println(interest(n, y, x));
    }
}
