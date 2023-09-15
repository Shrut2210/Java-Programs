package lab8;

import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Circle Area => " + c.Area());

        Triangle t = new Triangle();
        System.out.println("Triangle Area => " + t.Area());

        Square s = new Square();
        System.out.println("Square Area => " + s.Area());
    }
}

class Shape
{
}

class Circle extends Shape
{
    int rad;

    Circle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius => ");
        rad = sc.nextInt();
    }

    double Area()
    {
        return (3.14)*rad*rad;
    }
}

class Triangle extends Shape
{
    int base;
    int height;

    Triangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base length => ");
        base = sc.nextInt();
        System.out.println("Enter Height => ");
        height = sc.nextInt();
    }

    double Area()
    {
        return (0.5)*base*height;
    }
}

class Square extends Shape
{
    int side;

    Square()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side => ");
        side = sc.nextInt();
    }

    double Area()
    {
        return side*side;
    }
}