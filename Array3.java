import java.util.Scanner;
public class Array3 {
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

    int printValue()
    {
        int count = 0;
        for(int i=0; (i<(arr.length-1)); i++)
        {
            if(arr[i]>arr[i+1])
            {
                System.out.println("0");
               return 0;
            }

            else if(arr[i] == arr[i+1])
            {
                count++;
            }
            
            else
            {
                if(count<2)
                {
                    System.out.println("0");
                    return 0;
                }
                count = 0;
            }
            
        }

        if(count < 2){
            System.out.println("0");
            return 0;
        }
        else{
            System.out.println("1");
            return 1;
        }
    }
}

