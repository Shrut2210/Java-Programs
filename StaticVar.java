public class StaticVar {
    public static void main(String[] args) {
        
        StaticObj s1 = new StaticObj();
        s1.increamentcount();
        s1.increamentcount();
        s1.increamentcount();
        s1.increamentcount();


        StaticObj s2 = new StaticObj();
        s2.increamentcount();

        s2.printcount();
    }
}


class StaticObj{
    static int count = 0;

    public void increamentcount(){
        count++;
    }

    public void printcount() {
        System.out.println(count);
    }
}