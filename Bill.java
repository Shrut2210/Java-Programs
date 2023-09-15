import java.util.*;
public class Bill {
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter calls");
        int num = scn.nextInt();
        float total = 200.0f;

        if(num<=100)
        {
            total = 200;
        }

        else if(num > 100 && num <= 150)
        {
            total = total + (num - 100)*0.60f;
        }

        else if(num > 150 && num <= 200)
        {
            total = total + (50)*0.60f + (num - 150)*0.50f;
        }

        else
        {
            total = total + 50*0.60f + 50*0.50f + (num-200)*0.40f;
        }

        System.out.println("Total bill is = " + total);
    }
}
