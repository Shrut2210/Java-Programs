import java.util.*;

public class SpaceToUs {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        System.out.println(str.replace(' ', '_'));
    }
}
