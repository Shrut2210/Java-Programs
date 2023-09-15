package lab6;
import java.util.*;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TimeT t = new TimeT();

        System.out.println("Enter First Time => ");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();

        System.out.println("Enter Second Time => ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        t.sumOfTime(h1, m1, h2, m2);
    }
}

class TimeT
{

    void sumOfTime(int hour1, int minute1, int hour2, int minute2)
    {
        int m = minute1+minute2;
        int h = hour1+hour2;
        if(m > 60)
        {
            h++;
            m = (minute1+minute2) - 60;
        }

        System.out.println("Total Time is => " + (h) + 
        " : " + (m));
    }
}