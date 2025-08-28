import java.util.Scanner;

public class StudentGradeAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Calculate total, average, highest, lowest
        int total = 0, highest = marks[0], lowest = marks[0];
        for (int i = 0; i < n; i++) {
            total += marks[i];
            if (marks[i] > highest) highest = marks[i];
            if (marks[i] < lowest) lowest = marks[i];
        }
        double average = (double) total / n;

        // Display results
        System.out.println("\n--- Student Grade Report ---");
        System.out.println("Total Students: " + n);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        // Simple grading system
        System.out.println("\n--- Individual Grades ---");
        for (int i = 0; i < n; i++) {
            char grade;
            if (marks[i] >= 85) grade = 'A';
            else if (marks[i] >= 70) grade = 'B';
            else if (marks[i] >= 50) grade = 'C';
            else grade = 'F';

            System.out.println("Student " + (i + 1) + ": " + marks[i] + " → Grade " + grade);
        }

        sc.close();
    }
}
