import java.util.Scanner;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if number is positive and even
        if (number > 0 && number % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else if (number > 0 || number % 2 == 0) {
            System.out.println("The number is either positive or even.");
        } else {
            System.out.println("The number is neither positive nor even.");
        }
        
        scanner.close();
    }
}
