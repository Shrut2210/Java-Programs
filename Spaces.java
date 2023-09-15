import java.util.*;
public class Spaces {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        System.out.println("For double spaces : ");
        System.out.println(str.indexOf("  "));

        System.out.println("For triple spaces : ");
        System.out.println(str.indexOf("   "));
    }
}
