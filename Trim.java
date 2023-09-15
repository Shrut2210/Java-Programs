import java.util.*;

public class Trim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        //System.out.println("s => " + s.trim());

        //String x = "Shruti is... Shruti is... Shruti... Shruti...";
        //System.out.println("x => " + x.replace("Shruti","Gopi")); 

        String num = "101 102 201 202 301 302";
        String [] num2 = num.split(" ");

        for(int i=0 ; i<num2.length ; i++)
        {
            System.out.println(num2[i]);
        }
        System.out.println(String.join("--", num2));
    }
}
