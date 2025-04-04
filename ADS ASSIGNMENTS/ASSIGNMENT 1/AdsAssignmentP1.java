import java.util.*;

public class AdsAssignmentP1 {
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        return second;
    }

    public static void moveZerosToEnd(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 20, 0, 8, 15};

        int secondLargest = findSecondLargest(arr);
        moveZerosToEnd(arr);

        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Array after moving zeros: " + Arrays.toString(arr));
    }
}
