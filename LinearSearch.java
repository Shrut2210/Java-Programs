package lab5;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        boolean has = true;

        for(int i = 0; i<n ; i++)
        {
            x[i] = sc.nextInt();
        }

        do{
            System.out.print("Enter Number for Search => ");
            int a = sc.nextInt();

            for(int i=0; i<n ;i++)
            {
                if(a == x[i])
                {
                    System.out.print("Index is => " + i);
                    has = true;
                }
                else
                {
                    has = false;
                }
            }
        }while(has);
    }
}
