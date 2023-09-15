import java.lang.*;

public class Threads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable());
        Thread t2 = new Thread(new Runnable());
        
        try{
            for(int i=1;i<10;i++)
            {
                System.out.println("Good Morning");
            }
            t1.sleep(1000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        try{
            for(int i=1;i<10;i++)
            {
                System.out.println("Good Afternoon");
            }
            t2.sleep(3000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
