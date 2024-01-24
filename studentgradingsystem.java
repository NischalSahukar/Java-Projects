package proj1;
import java.util.*;

public class studentgradingsystem {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Student Grading System!");
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
                
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + " details:");
            System.out.println("Enter student name:");
            String name = scanner.next();
            
            System.out.println("Enter student roll no:");
            String rollno = scanner.next();
            
            System.out.println("Enter number of subjects:");
            int numSubjects = scanner.nextInt();
            
            double totalScore = 0;
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter score for Subject " + (j + 1) + ": ");
                double score = scanner.nextDouble();
                totalScore += score;
            }

            double averageScore = totalScore / numSubjects;

            char grade = calculateGrade(averageScore);

            System.out.println("\nStudent Name: " + name);
            System.out.println("Overall Grade: " + grade);
        }

        scanner.close();
    }
                
private static char calculateGrade(double averageScore) {
    if (averageScore >= 90) {
        return 'A';
    } else if (averageScore >= 80) {
        return 'B';
    } else if (averageScore >= 70) {
        return 'C';
    } else if (averageScore >= 60) {
        return 'D';
    } else {
        return 'F';
    }
}
}