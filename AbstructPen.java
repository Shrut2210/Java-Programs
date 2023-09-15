abstract class Pen{
    abstract void write();
    abstract void refill();
}

class BallPen extends Pen
{
    void write()
    {
        System.out.println("Writing...");
    }

    void refill()
    {
        System.out.println("Refilling...");
    }
}

public class AbstructPen
{
    public static void main(String[] args) {
        BallPen obj = new BallPen();

        obj.write();
        obj.refill();
    }
}