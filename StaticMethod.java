/* incapsulated na hoy avi method
 * like pop programming
 * you don't need to make object
 */

public class StaticMethod {
    public static void main(String[] args) {
        StaticObj2.increament();
        StaticObj2.printcount();
    }
}


class StaticObj2{
    static int count = 0;

    public static void increament(){
        count++;
    }

    public static void printcount(){
        System.out.println(count);
    }
}