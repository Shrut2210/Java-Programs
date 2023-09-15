public class Monkey {
    public static void main(String[] args) {
        MyMonkey obj = new Human();
        obj.Jump();
        obj.Bite();

        BasicAnimal obj1 = new Human();
        obj1.Eat();
        obj1.Sleep();
    }
}

class MyMonkey
{
    void Jump()
    {
        System.out.println("Jumping...");
    }
    void Bite()
    {
        System.out.println("Biting...");
    }
}

interface BasicAnimal
{
    void Eat();
    void Sleep();
}

class Human extends MyMonkey implements BasicAnimal
{
    public void Eat()
    {
        System.out.println("Eatting...");
    }

    public void Sleep()
    {
        System.out.println("Sleeping...");
    }
}