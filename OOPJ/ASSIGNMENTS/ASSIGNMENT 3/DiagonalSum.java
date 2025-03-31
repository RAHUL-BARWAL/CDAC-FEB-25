public class DiagonalSum {
    public static void main(String[] args) {
        int n = 3; // Size of the square matrix

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        // Compute the sum of both diagonals
        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i]; // Primary diagonal (top-left to bottom-right)
            secondaryDiagonalSum += matrix[i][n - 1 - i]; // Secondary diagonal (top-right to bottom-left)
        }

        // Print the results
        System.out.println("Sum of primary diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);
    }
}
