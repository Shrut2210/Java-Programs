import java.util.*;

public class Table
{

    static void mtable(int n)
    {
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println("   " + n + " * " + i + " = " + (n*i));
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        mtable(n);
    }
}