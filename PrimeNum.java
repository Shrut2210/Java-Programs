import java.util.*;

public class PrimeNum {

    public static void check(int n)
    {
        int flag = 0;
        for(int i = 2; i<n ; i++)
        {
            if(n%i == 0)
            {
                flag = 1;
            }
        }

        if(flag == 0)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        check(n);
    }
}
