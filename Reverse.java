import java.util.*;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter num ");
        int n = scn.nextInt();

        int d,num=0;

        while(n>0)
        {
            d = n%10;
            num = num*10 + d;
            n = n/10;
        }

        System.out.println(num);
    }
}
