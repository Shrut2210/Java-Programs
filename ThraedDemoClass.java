import java.util.*;

public class ThraedDemoClass {
    public static void main(String[] args) {
        new MyThread();
        
        
        try
        {
            for(int j=0;j<50;j++)
            {
                System.out.println("This is MainThraed...");
            }
            Thread.sleep(300);
        }
        catch(Exception e)
        {
            e.fillInStackTrace();
        }
    }
}

class MyThread extends Thread
{
    MyThread()
    {
        super("Demo Thraed");
        start();
    }
    public void run()
    {
        try
        {
            for(int i=0;i<50;i++)
            {
                System.out.println("This is MyThread...");
            }
            Thread.sleep(200);
        }
        catch(Exception e)
        {
            e.fillInStackTrace();
        }
    }
}
