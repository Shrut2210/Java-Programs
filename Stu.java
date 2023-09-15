package lab6;
import java.util.*;

public class Stu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.display();
        Student s2 = new Student(sc.nextLine().charAt(0), sc.nextLine(), sc.nextInt() , sc.nextInt());
        s2.display();

    }
}

class Student
{
    int roll_no;
    String name;
    char gender;
    int marks;
    static int count=0;

    Student()
    {
        roll_no = 101;
        name = "Shruti Vadgama";
        gender = 'F';
        marks = 100;
        count++;
    }

    Student(char gender, String name, int roll_no, int marks)
    {
        this.roll_no = roll_no;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
    }

    void display(){
        System.out.println("Enrollment No => " + roll_no);
        System.out.println("Name => " + name);
        System.out.println("Gender => " + gender);
        System.out.println("Marks => " + marks);
        System.out.println("Total Object are => " + count);
    }
}