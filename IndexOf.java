package lab6;
import java.util.*;

public class IndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int temp = a.indexOf("Shruti");

        while(temp>=0)
        {
                System.out.println("Found at => " + temp);
                temp = a.indexOf("Shruti", temp+1);
        }
        
    }
}
