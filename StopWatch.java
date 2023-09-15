import java.util.*;

public class StopWatch {
    public static void main(String[] args) {
        
    }
}

class StopWatchS
{
    int hour;
    int min;
    int second;
    int ms;

    StopWatchS(int hour,int min,int second,int ms)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour => ");
        this.hour = sc.nextInt();
        System.out.print("Enter min => ");
        this.min = sc.nextInt();
        System.out.print("Enter second => ");
        this.second = sc.nextInt();
        System.out.print("Enter ms => ");
        this.ms = sc.nextInt();


        while(hour == this.hour && min == this.min && second == this.second && ms == this.ms)
        {
            
        }
    }

    void print()
    {
        System.out.println(hour + " : " + min + " : " + second + " : " + ms);
    }
}