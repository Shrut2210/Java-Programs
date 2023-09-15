package lab6;
import java.util.*;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius => ");
        float r = sc.nextFloat();

        Circle c = new Circle();
        System.out.println("Area => " + c.circleArea(r));
        System.out.println("Perimeter => " + c.circlePeriMeter(r));
    }
}

class Circle
{

    float circleArea(float rad)
    {
        return 3.14f*rad*rad;
    }

    float circlePeriMeter(float rad)
    {
        return 6.28f*rad;
    }
}
