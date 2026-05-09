import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSub = scanner.nextInt();
        int[] marks = new int[numSub];
        int totalMarks = 0;
        for (int i = 0; i < numSub; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (/100): ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        double averagePer = (double) totalMarks / numSub;
        String grade;
        if (averagePer >= 90) {
            grade = "A+";
        } else if (averagePer >= 80) {
            grade = "A";
        } else if (averagePer >= 70) {
            grade = "B";
        } else if (averagePer >= 60) {
            grade = "C";
        } else if (averagePer >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePer);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}