public class AverageCalculation {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30; // Declare and initialize three int numbers
        
        // Calculate the average with typecasting to double
        double average = (double) (num1 + num2 + num3) / 3;
        
        // Display the result
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Average (in double): " + average);
    }
}
