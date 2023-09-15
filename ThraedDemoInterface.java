public class ThraedDemoInterface {
    public static void main(String[] args) {
        InterfaceThraed it = new InterfaceThraed();
        Thread t = new Thread(it);
        t.start();
    }
}


class InterfaceThraed implements Runnable
{
    public void run()
    {
        for(int i=0;i<30;i++)
        {
            System.out.println("Runnable Thraed...");
        }
    }
}