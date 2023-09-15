public class ThraedPriority extends Thread{
    public static void main(String[] args) {
        ThraedPriority t1 = new ThraedPriority("low");
        t1.setPriority(MIN_PRIORITY);
        ThraedPriority t2 = new ThraedPriority("High");
        t2.setPriority(MAX_PRIORITY);

        t1.start();
        t2.start();
    }

    public ThraedPriority(String str)
    {
        super(str);
    }

    public void run()
    {
        for(int i=0;i<40;i++)
        {
            try
            {
                sleep(900);
                System.out.println("Call of " + this.getName() + i);
            }
            catch
            (Exception e)
            {
                e.fillInStackTrace();
            }
        }
    }
}
