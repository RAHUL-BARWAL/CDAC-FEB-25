class Student {
    String name;
    int mark1, mark2, mark3;

    Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    int totalMarks() {
        return mark1 + mark2 + mark3;
    }

    double averageMarks() {
        return totalMarks() / 3.0;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks());
        System.out.println("Average Marks: " + averageMarks());
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 85, 90, 88);
        Student student2 = new Student("Bob", 78, 80, 85);

        student1.display();
        System.out.println();
        student2.display();
    }
}
