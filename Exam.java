import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        TimeE1 t1 = new TimeE1();
        TimeE1 t2 = new TimeE1();
        TimeE1 t3 = new TimeE1();
        t1.getValue(t2, t3);
        System.out.println(t1.printValue());
    }
}

class TimeE1
{
    int h,m,s;
    int hsum,msum,ssum;

    TimeE1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hour : ");
        h = sc.nextInt();
        System.out.print("Enter Min : ");
        m = sc.nextInt();
        System.out.print("Enter Second : ");
        s = sc.nextInt();
    }

    void getValue(TimeE1 t2, TimeE1 t3)
    {
        this.hsum=0;
        this.msum=0;
        this.ssum=0;

        ssum = this.s + t2.s;

        if(ssum > 60)
        {
            ssum -= 60;
            msum++;
        }

        msum = this.m + t2.m;

        if(msum > 60)
        {
            msum -= 60;
            hsum++;
        }

        hsum = this.h + t2.h;

        if(ssum-t3.s < 0)
        {
            ssum = 60 - (t3.s-ssum);
            msum--;
        }
        else
        {
            ssum = ssum - t3.s;
        }

        if(msum-t3.m < 0)
        {
            msum = 60 - (t3.m-msum);
            hsum--;
        }
        else
        {
            msum = msum - t3.m;
        }

        if(hsum-t3.h < 0)
        {
            hsum = 12 - (t3.h-hsum);
        }
        else
        {
            hsum = hsum - t3.h;
        }
    }

    String printValue()
    {
        return this.hsum + " : " + this.msum + " : " + this.ssum;
    }
}
