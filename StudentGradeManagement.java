import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int score;

    Student(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
}

public class StudentGradeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Enter student name: ");
            String name = sc.next();

            System.out.print("Enter student score: ");
            int score = sc.nextInt();

            students.add(new Student(name, score));
        }

        int total = 0;
        int highest = students.get(0).score;
        int lowest = students.get(0).score;

        for (Student s : students)
        {
            total += s.score;

            if (s.score > highest) 
            {
                highest = s.score;
            }

            if (s.score < lowest)
            {
                lowest = s.score;
            }
        }
        double average = (double) total / n;
        System.out.println("\n----- Student Grade Report -----");
        
        for (Student s : students)
        {
            System.out.println("Name: " + s.name + "  Score: " + s.score);
        }
        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        sc.close();
    }
}