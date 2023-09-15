import java.util.Scanner;

class MyException2 extends Exception
{
    public MyException2(String str)
    {
        super(str);
    }
}

public class CustomException {
    static void denominator(int x, int y) throws MyException2
    {
        if(y == 0)
        {
            throw new MyException2("Invlaid denominator...");
        }
        else
        {
            System.out.println(x/y);
        }
    }

    public static void main(String[] args) {

        try
        {
            Scanner sc = new Scanner(System.in);
            denominator(sc.nextInt(), sc.nextInt());
        }
        catch(MyException2 e)
        {
            System.out.println("Caught an exception...");
            System.out.println(e);
        }
    }
}


