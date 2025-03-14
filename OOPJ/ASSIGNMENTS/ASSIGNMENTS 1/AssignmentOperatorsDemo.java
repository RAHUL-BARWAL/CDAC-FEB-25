import java.util.Scanner;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.print("Enter a value to operate with: ");
        int value = scanner.nextInt();
        
        // Demonstrating assignment operators
        System.out.println("Initial num: " + num);
        num += value;
        System.out.println("After num += value: " + num);
        num -= value;
        System.out.println("After num -= value: " + num);
        num *= value;
        System.out.println("After num *= value: " + num);
        num /= value;
        System.out.println("After num /= value: " + num);
        num %= value;
        System.out.println("After num %= value: " + num);
        
        scanner.close();
    }
}
