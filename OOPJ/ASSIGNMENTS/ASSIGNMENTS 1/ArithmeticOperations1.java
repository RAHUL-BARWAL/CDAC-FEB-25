import java.util.Scanner;

public class ArithmeticOperations1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Performing arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = (num2 != 0) ? num1 / num2 : 0;
        int remainder = (num2 != 0) ? num1 % num2 : 0;
        
        // Displaying results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        if (num2 != 0) {
            System.out.println("Division: " + quotient);
            System.out.println("Modulus: " + remainder);
        } else {
            System.out.println("Division and Modulus operations are not possible as the divisor is 0.");
        }
        
        scanner.close();
    }
}
