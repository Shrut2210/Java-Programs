public class Synchronization {
    public static void main(String[] args) {
        Table t = new Table();
        Table1 t1 = new Table1(t);
        Table2 t2 = new Table2(t);
        t1.start();
        t2.start();
    }
}

class Table
{
    synchronized public void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            try
            {
                Thread.sleep(400);
                System.out.println(n + " X " + i + " = " + (n*i));
            }
            catch
            (Exception e)
            {
                e.fillInStackTrace();
            }
        }
    }
}

class Table1 extends Thread
{
    Table t;
    Table1(Table t)
    {
        this.t = t;
    }
    
    public void run()
    {
        t.printTable(5);
    }
}

class Table2 extends Thread
{
    Table t;
    Table2(Table t)
    {
        this.t = t;
    }
    
    public void run()
    {
        t.printTable(9);
    }
}