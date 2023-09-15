import java.util.*;
public class Loop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter first number");
        int x = scn.nextInt();
        System.out.println("Enter second number");
        int y = scn.nextInt();

        for(int i = x ; i <= y ; i++)
        {
            if(i%2 == 0 && i%3 != 0)
            {
                System.out.println(i);
            }
        }
    }
}
