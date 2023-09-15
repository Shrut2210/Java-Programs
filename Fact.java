import java.util.*;

public class Fact {

    public static int fact(int n)
    {
        if(n == 1)
        {
            return n;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("enter num ");
        int n = scn.nextInt();

        System.out.println(fact(n));
    }
}
