import java.util.*;

public class Fibo {

    public static int fibo(int n)
    {
        if(n == 1 || n == 0)
        {
            return n;
        }
        else
        {
            return n*fibo(n-1);
        }
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("enter num ");
        int n = scn.nextInt();

        for(int i = 1 ; i < n ;i++)
        {
            System.out.println(fibo(i));
        }
        
    }
}
