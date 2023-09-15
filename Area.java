import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Area {

    public static double circlearea(int r)
    {
        return 3.14*r*r;
    }

    public static double squarearea(int a) {
        return a*a;
    }

    public static double tringlearea(int l, int b) {
        return 0.5*l*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r,a,l,b;
        String s;
        boolean isObject = true;

        do
        {
            System.out.print("Enter Object => ");
            s = sc.nextLine();

            if(s.equals("square"))
            {
                System.out.print("Enter Length of sides : ");
                a = sc.nextInt();

                System.out.print("Area is => " + (squarearea(a)));
                isObject = true;
            }

            else if(s.equals("circle"))
            {
                System.out.print("Enter Radius : ");
                r = sc.nextInt();

                System.out.print("Area is => " + (circlearea(r)));
                isObject = true;
            }

            else if(s.equals("triangle"))
            {
                System.out.print("Enter Length of side : ");
                l = sc.nextInt();
                System.out.print("Enter Width : ");
                b = sc.nextInt();

                System.out.print("Area is => " + (tringlearea(l,b)));
                isObject = true;
            }
            else
            {
                System.out.println("Enter proper object : ");
                isObject = false;
            }
        }while(isObject != true);

    }
}
