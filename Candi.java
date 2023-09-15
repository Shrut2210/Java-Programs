package lab6;
import java.util.*;

public class Candi {
    public static void main(String[] args) {
        
        Candidate c = new Candidate();

        c.getCandidateDetails();

        c.displayCandidateDetails();
    }
}

class Candidate{

    int candidate_ID;
    String candidate_name;
    int candidate_age;
    int candidate_weight;
    float candidate_height;

    void getCandidateDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter candidate name => ");
        candidate_name = sc.nextLine();
        System.out.print("Enter candidate Id => ");
        candidate_ID = sc.nextInt();
        System.out.print("Enter candidate age => ");
        candidate_age = sc.nextInt();
        System.out.print("Enter candidate weight => ");
        candidate_weight = sc.nextInt();
        System.out.print("Enter candidate height => ");
        candidate_height = sc.nextFloat();
    }

    void displayCandidateDetails()
    {
        System.out.println("Name => " + candidate_name);
        System.out.println("Id => " + candidate_ID);
        System.out.println("Age => " + candidate_age);
        System.out.println("weight => " + candidate_weight);
        System.out.println("height => " + candidate_height);
    }
}