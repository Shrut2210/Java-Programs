package lab6;
import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank_Account c = new Bank_Account();

        c.getAccountDetails( sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextFloat());

        c.displayAccountDetails();
    }
}

class Bank_Account{

    int Act_No;
    String User_Name;
    String Email;
    String Type;
    float balance;

    void getAccountDetails(String User_Name, String Email , String Type, int Act_No, float balance)
    {
        this.User_Name = User_Name;
        this.Email = Email;
        this.Type = Type;
        this.Act_No = Act_No;
        this.balance = balance;
    }

    void displayAccountDetails()
    {
        System.out.println("User_Name => " + User_Name);
        System.out.println("Email => " + Email);
        System.out.println("Type => " + Type);
        System.out.println("Act_No => " + Act_No);
        System.out.println("Balance => " + balance);
    }
}