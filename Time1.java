package lab6;
import java.util.*;

public class Time1 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TimeS t1 = new TimeS(sc.nextInt(), sc.nextInt());
        TimeS t2 = new TimeS(sc.nextInt(), sc.nextInt());
        t1.addTime(t2);
        t1.print();
 }   
}

class TimeS
{
    int hour;
    int min;

    TimeS(int hour,int min)
    {
        this.hour = hour;
        this.min = min;
    }

    void addTime(TimeS al)
    {
        this.hour = this.hour + al.hour;
        this.min = this.min + al.min;

        if(this.min>60)
        {
            this.min = this.min - 60;
            this.hour = this.hour + 1;
        }
    }

    void print()
    {
        System.out.println(this.hour + " : " + this.min);
    }
}