import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[20];
        int[] even = new int[20];
        int[] odd = new int[20];
        
        int evenIndex = 0;
        int oddIndex = 0;

        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) {
                even[evenIndex++] = arr[i];
            } else {
                odd[oddIndex++] = arr[i];
            }
        }

        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        scanner.close();
    }
}
