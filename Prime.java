import java.util.*;
public class Prime {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter number ");
        int n = scn.nextInt();
        int flag = 0;

        for(int i = 2 ; i < n ; i++)
        {
            if(n%i == 0)
            {
                flag = 1;
                break;
            }
        }

        if(flag==1)
        {
            System.out.println("Not Prime");
        }

        else
        {
            System.out.println("Prime");
        }
    }
}
