import java.util.Scanner;


class MyException extends Exception
{
    public MyException(String str)
    {
        super(str);
    }
}

public class Demo2
{
    static void validate(int age) throws MyException
    {
        if(age<18)
        {
            throw new MyException("Age is not valid for vote....");
        }
        else
        {
            System.out.println("Welcome to vote....");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            validate(sc.nextInt());
        } catch (MyException e) {
            // TODO: handle exception
            System.out.println("Caught an exception");
            System.out.println(e.getMessage());
        }
    }
}


