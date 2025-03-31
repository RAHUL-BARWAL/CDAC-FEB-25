import java.util.Scanner;
import java.util.InputMismatchException;

class Student {
    String name;
    int rollNo;
    double[] marks = new double[5];
    double average;
    char grade;

    Student(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                throw new IllegalArgumentException("Marks should be between 0 and 100.");
            }
        }
        
        this.marks = marks;
    }

    void calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        average = sum / marks.length;
    }

    void calculateGrade() {
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();

            double[] marks = new double[5];
            System.out.println("Enter marks for 5 subjects:");
            for (int i = 0; i < 5; i++) {
                marks[i] = sc.nextDouble();
            }

            Student student = new Student(name, rollNo, marks);
            student.calculateAverage();
            student.calculateGrade();
            student.displayStudentInfo();

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value for roll number or marks.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
