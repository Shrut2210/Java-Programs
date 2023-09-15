package lab5;
import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int oddcount=0, evencount=0;
        int[] x = new int[n];

        for(int i = 0; i<n ;i++)
        {
            x[i] = sc.nextInt();

            if(x[i]%2 == 0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }
        }

        System.out.println("Total Even Numbers => " + evencount);
        System.out.println("Total Odd Numbers => " + oddcount);

    }
}
