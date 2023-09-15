import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<a.length ; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
            int temp;
            for(int j=i;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Enter number for serach => ");
        int x = sc.nextInt();
        int max,min;
        min = 0;
        max = (a.length - 1);
        boolean isTrue = false;

        while(max>=min)
        {
            int mid = (max+min)/2;

            if(x<a[mid])
            {
                max = (mid-1);
            }

            else if(x == a[mid])
            {
                System.out.println("Found at => " + mid);
                isTrue = true;
                break;
            }

            else
            {
                min = mid + 1;
            }
        }

        if(!isTrue)
        {
            System.out.println("Not Found");
        }

        
    }
}
