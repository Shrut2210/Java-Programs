import java.util.*;
public class NthTerm {

    static int term(int x)
    {
        if(x==1 || x==2)
        {
            return x-1;
        }
        else
        {
            return term(x-1)+term(x-2);
        }
    }
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       
       int n = scn.nextInt();
       System.out.println(term(n));
    }
}
