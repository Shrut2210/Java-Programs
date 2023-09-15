import java.util.Scanner;
class GuessGame
{
    Player p1;
    Player p2;
    Player p3;

    void startGame()
    {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // int guessp1 = 0;
        // int guessp2 = 0;
        // int guessp3 = 0;

        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'am taking number between 0 to 9 ...");

        while(true)
        {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            Scanner x = new Scanner(System.in);
            int guessp1 = x.nextInt();
            System.out.println("Player one guessed " + guessp1);

            int guessp2 = x.nextInt();
            System.out.println("Player two guessed " + guessp2);

            int guessp3 = x.nextInt();
            System.out.println("Player three guessed " + guessp3);

            if(guessp1 == targetNumber)
            {
                p1isright = true;
            }

            if(guessp2 == targetNumber)
            {
                p2isright = true;
            }

            if(guessp3 == targetNumber)
            {
                p3isright = true;
            }

            if(p1isright || p2isright || p3isright)
            {
                System.out.println("We have a Winner!");
                System.out.println("Player one got it right? " + p1isright);
                System.out.println("Player two got it right? " + p2isright);
                System.out.println("Player three got it right? " + p3isright);
                break;
            }

            else
            {
                System.out.println("Player have to try again");
            }
        }
    }
}

class Player
{
    int number = 0;

    void guess()
    {
        // number = (int) (Math.random() * 10);
        // System.out.println("I'am guessing " + number);
    }
}

public class GameLauncher
{
    public static void main(String[] args)
    {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}