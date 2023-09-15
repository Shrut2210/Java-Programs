package lab6;
import java.util.*;

public class Emplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

            System.out.println("Enter name => ");
            String name = sc.nextLine();

            System.out.println("Designation => ");
            String des = sc.nextLine();

            System.out.println("Enter Id => ");
            int id = sc.nextInt();

            System.out.println("Enter age => ");
            int age = sc.nextInt();

            System.out.println("Enter salary => ");
            float salary = sc.nextFloat();

            e.getEmployeeDetails(name, des, id, age, salary);
            e.displayEmployeeDetails();
    }
}


class Employee
{
    int Employee_ID;
    String Employee_Name;
    String Designation;
    int Age;
    float Salary;

    void getEmployeeDetails(String Employee_Name, String Designation, int Employee_ID, int Age, float Salary)
    {
        this.Employee_Name = Employee_Name;
        this.Designation = Designation;
        this.Employee_ID = Employee_ID;
        this.Age = Age;
        this.Salary = Salary;
    }

    void displayEmployeeDetails()
    {
        System.out.println("Name => " + Employee_Name);
        System.out.println("Id => " + Employee_ID);
        System.out.println("Age => " + Age);
        System.out.println("Designation => " + Designation);
        System.out.println("Salary => " + Salary);
    }
}