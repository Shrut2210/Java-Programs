import java.util.*;
public class ForEach {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        float [] marks = new float[n];
        float sum = 0.0f;

        for(int i=0;i<n;i++)
        {
            marks[i]=scn.nextFloat();
        }

        for(float element: marks)
        {
            sum += element;
        }

        System.out.print("average is " + (sum)/marks.length);
    }
}
