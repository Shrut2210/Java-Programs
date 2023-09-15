import java.util.*;
public class Sorted {
    public static void main(String[] args) 
    {
       Scanner scn = new Scanner(System.in);
       
       int n = scn.nextInt();
        boolean isSorted = true;
       int [] num = new int[n];
       
       int i;

       for(i=0;i<n;i++)
       {
           num[i]=scn.nextInt();
       }

       for(i=0;i<n;i++)
       {
        if(num[i] > num[i+1])
        {
            isSorted = false;
            break;
        }
       }


       if(isSorted)
       {
            System.out.print("array is sorted");
       }
       else
       {
        System.out.print("array is not sorted");
       }

    // boolean isSorted = true;
    //     int [] arr = {1, 12, 3, 4, 5, 34, 67};
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i] > arr[i+1]){
    //             isSorted = false;
    //             break;
    //         }
    //     }
    //     if(isSorted){
    //         System.out.println("The Array is sorted");
    //     }
    //     else{
    //         System.out.println("The Array is not sorted");
    //     }
    }
}
