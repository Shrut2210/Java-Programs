abstract class Phone
{
    abstract void with();
    abstract void lift();
    abstract void disconnected();
}

class SmartTelePhone extends Phone
{
    void with()
    {
        System.out.println("with");
    }

    void lift()
    {
        System.out.println("lift");
    }

    void disconnected()
    {
        System.out.println("disconnected");
    }
}

public class TelePhone {
    public static void main(String[] args) {
        Phone obj = new SmartTelePhone();
        obj.with();
    }
}
