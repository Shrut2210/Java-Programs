import java.util.*;

import javax.print.DocFlavor.STRING;
public class Clac 
{
    public static void main(String[] args) 
    {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("enter number :");
        int x = scn.nextInt();
        System.out.println("enter number :");
        int y = scn.nextInt();

        scn.next();
        String ope = scn.next();

        switch (ope)
        {
            case "sum":
            System.out.println("sum is = " + (x+y));
            break;

            case "sub":
            System.out.println("sub is = " + Math.abs(x-y));
            break;

            case "multi":
            System.out.println("multiplication is = " + (x*y));
            break;

            case "div":
            System.out.println("division is = " + (float)(x/y));
            break;
        }
        
    }
}
