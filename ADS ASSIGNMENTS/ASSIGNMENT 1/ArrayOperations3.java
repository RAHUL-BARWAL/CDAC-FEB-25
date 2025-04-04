import java.util.*;

public class ArrayOperations3 {
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static int findFirstOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= key) {
                if (arr[mid] == key) result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static int findLastOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= key) {
                if (arr[mid] == key) result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static int countOccurrences(int[] arr, int key) {
        int first = findFirstOccurrence(arr, key);
        int last = findLastOccurrence(arr, key);
        return (first == -1) ? 0 : (last - first + 1);
    }

    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];
        if (arr[0] > arr[1]) return arr[0];
        if (arr[n - 1] > arr[n - 2]) return arr[n - 1];

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArr = {1, 3, 3, 3, 5, 6, 8};
        int key = 3;

        int index = binarySearch(sortedArr, key);
        int first = findFirstOccurrence(sortedArr, key);
        int last = findLastOccurrence(sortedArr, key);
        int count = countOccurrences(sortedArr, key);

        System.out.println("Key found at index: " + index);
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
        System.out.println("Total count of key: " + count);

        int[] peakArr = {1, 2, 18, 4, 5, 0};
        int peak = findPeakElement(peakArr);
        System.out.println("Peak element: " + peak);
    }
}
