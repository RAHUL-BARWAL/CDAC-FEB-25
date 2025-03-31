import java.util.Scanner;

public class DivisibilityByThree {
    public static boolean isDivisibleBy3(int num) {
        num = Math.abs(num); 
        
        while (num > 0) {
            int oddCount = 0, evenCount = 0;
            
            while (num > 0) {
                if ((num & 1) == 1) 
                    oddCount++;
                num >>= 1; 
                
                if ((num & 1) == 1) 
                    evenCount++;
                num >>= 1; 
            }
            
            num = Math.abs(oddCount - evenCount); 
        }
        
        return num == 0;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        
        if (isDivisibleBy3(num)) {
            System.out.println(num + " is divisible by 3");
        } else {
            System.out.println(num + " is not divisible by 3");
        }
    }
}
