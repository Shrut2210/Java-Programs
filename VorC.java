import java.util.Scanner;

public class VorC
{
    public static void main(String[] args)
    {
        Scanner let = new Scanner(System.in);

        System.out.println("Enter letter : ");
        char c = let.next().charAt(0);

        if(c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        {
            System.out.println("Char is Vowel");
        }
        else
        {
            System.out.println("Char is Consosnant");
        }
    }
}