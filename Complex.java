package lab6;
import java.util.*;

public class Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ComplexNum c1 = new ComplexNum();
        c1.getInput();
        ComplexNum c2 = new ComplexNum();
        c2.getInput();
        ComplexNum add = new ComplexNum();
        add.addNum(c1,c2);
        System.out.println("Sum is => " + add.r + " + " + add.i + " i ");

    }
}

class ComplexNum
{
    int r;
    int i;
    ComplexNum(){

    }

    void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part => ");
        r = sc.nextInt();
        System.out.print("Enter imagnary part => ");
        i = sc.nextInt();
    }

    void addNum(ComplexNum x,ComplexNum y)
    {
        this.r = x.r + y.r;
        this.i = x.i + y.i;
    }

}