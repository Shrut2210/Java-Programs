import java.util.Scanner;
public class ArrayCount {
    public static void main(String[] args) {
        IsOrNot is = new IsOrNot();
        is.getValue();
        is.printValue();
    }
}

class IsOrNot
{
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr = new int[n];

    void getValue()
    {
        
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    void printValue()
    {
        int count = 0,dcount = 0,dc=1;
        for(int i=0,j=1 ; (i<(arr.length-1)) && (j<(arr.length-2)); i++,j++)
        {
            if(arr[i]>arr[j])
            {
               System.out.println("0");
               return;
            }

            // else if(arr[i] == arr[j])
            // {
            //     count++;
            // }
            
            // else
            // {
            //     if(count<2)
            //     {
            //         System.out.println("0");
            //         return;
            //     }
            //     count = 0;
            // }
            else if(arr[i] != arr[j])
            {
                dc++;
            }
        }

        // if(count < 2){
        //     System.out.println("0");
        // }
        // else{
        //     System.out.println("1");
        // }
        for(int i=0;i<(arr.length-1);i++)
        {
            if(arr[i] == arr[i-1] && (i>=1))
            {
                continue;
            }
            count=0;
            dcount=0;
            for(int j=i+1;j<(arr.length-1);j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(count>=2)
            {
                dcount++;
            }
        }
        if(dcount == dc)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
