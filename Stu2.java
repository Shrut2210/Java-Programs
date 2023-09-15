package lab6;
import java.util.*;

public class Stu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student2 e = new Student2();

         e.displayStudentsDetails();
    }
}

class Student2
{
    //Enrollment_No, Student_Name, Semester, CPI and SPI 
    int Enrollment_No;
    String Student_Name;
    int Semester;
    float CPI;
    float SPI;

    Student2()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name => ");
            String Student_Name = sc.nextLine();

            System.out.println("Enrollment_No => ");
            int Enrollment_No = sc.nextInt();

            System.out.println("Enter Sem. => ");
            int Semester = sc.nextInt();

            System.out.println("Enter CPI => ");
            float CPI = sc.nextFloat();

            System.out.println("Enter SPI => ");
            float SPI = sc.nextFloat();
    }

    void displayStudentsDetails()
    {
        System.out.println("Name => " + Student_Name);
        System.out.println("Enrollment No => " + Enrollment_No);
        System.out.println("Sem. => " + Semester);
        System.out.println("CPI => " + CPI);
        System.out.println("SPI => " + SPI);
    }
}
