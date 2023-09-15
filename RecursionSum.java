import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class RecursionSum {

    static int sum(int x)
    {
        if(x==0)
        {
            return 0; 
        }
        else if(x==1)
        {
            return 1;
        }
        else
        {
            return x + sum(x-1);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        System.out.println("sum is " + sum(n));
    }
}
