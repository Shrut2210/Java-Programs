import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RectangleR r1 = new RectangleR();
        System.out.println("Area => " + r1.getArea());
        System.out.println("Perimeter => " + r1.getPerimeter());

        RectangleR r2 = new RectangleR(sc.nextDouble(), sc.nextDouble());
        System.out.println("Area => " + r2.getArea());
        System.out.println("Perimeter => " + r2.getPerimeter());
        
        RectangleR c = new RectangleR();
        c.copy(r2);
        System.out.println("This is copy => " + c.height + " and " + c.width);
    }
}

class RectangleR
{
    double width;
    double height;

    RectangleR()
    {
        width = 1;
        height = 1;
    }

    void copy(RectangleR x)
    {
        this.width = x.width;
        this.height = x.height;
    }

    RectangleR(double width, double height)
    {
        this.height = height;
        this.width = width;
    }

    double getArea()
    {
        return width*height;
    }

    double getPerimeter()
    {
        return 2*(width+height);
    }
}