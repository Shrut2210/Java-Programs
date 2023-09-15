import java.util.*;

public class FloatArraySum {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        float [] array = new float[5];
        int i;
        float sum = 0.0f;

        for(i=0;i<5;i++)
        {
            System.out.print("enter element : ");
            array[i] = scn.nextFloat();
            sum +=array[i];
        }

        System.out.println(sum);
    }
}
