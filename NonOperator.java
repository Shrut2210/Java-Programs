import java.util.Scanner;

public class NonOperator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ope o = new Ope(sc.nextInt(), sc.nextInt());
        System.out.println(o.divide());
    }
}

class Ope
{
    int a,b;

    Ope(int a,int b)
    {
        this.a = a;
        this.b = b;
    }

    int divide()
    {
        int count = 0;

        while(a>=0)
        {
            
        }
        return (count-1);
    }
}