public class DoubleToIntCasting {
    public static void main(String[] args) {
        double doubleValue = 42.78; // Declare and initialize a double value
        int intValue = (int) doubleValue; // Explicit type casting from double to int

        // Display both values
        System.out.println("Double value: " + doubleValue);
        System.out.println("Integer value after casting: " + intValue);

        // Explanation of data loss
        System.out.println("Note: When converting a double to an int, the decimal part is truncated, leading to loss of precision.");
    }
}
