import java.util.*;

public class ReplaceName {
        public static void main(String[] args)
        {
            Scanner scn = new Scanner(System.in);
            System.out.println("enter name to replace ");
            String str = scn.nextLine();
    
            String letter = "Dear <|name|>, Thanks a lot";

            System.out.println(letter.replace("<|name|>", "shruti"));
        }
}
