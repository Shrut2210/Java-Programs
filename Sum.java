package lab5;
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(),sum=0;
        int[] x = new int[n];

        for(int i=0; i<n; i++)
        {
            x[i] = sc.nextInt();

            if(x[i]%3 == 0 || x[i]%5 == 0)
            {
                sum += x[i];
            }
        }

        System.out.print(sum);
    }
}
