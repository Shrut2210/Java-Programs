package lab6;
import java.util.*;

public class Time2 {
    public static void main(String[] args) {
        TimeS2 t1 = new TimeS2();
        t1.getValue();
        TimeS2 t2 = new TimeS2();
        t2.getValue();
        TimeS2 t3 = new TimeS2();
        t3.addTimeS(t1, t2);
        System.out.println(t3.h + " : " + t3.m);
    }
}

class TimeS2
{
    int h;
    int m;

    TimeS2()
    {

    }

    void getValue()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hour => ");
        this.h = sc.nextInt();
        System.out.print("Enter Min => ");
        this.m = sc.nextInt();
    }

    void addTimeS(TimeS2 x,TimeS2 y)
    {
        this.h = x.h + y.h;
        this.m = x.m + y.m;

        if(this.m>60)
        {
            this.m -= 60;
            this.h ++;
        }
    }
}