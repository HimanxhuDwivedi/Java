import java.util.*;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[row][cols];

        // Input
        // outer loop for row
        for (int i = 0; i < row; i++) {
            // Inner loop for cols
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        // Binary search.
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                // Comparison with X
                if (numbers[i][j] == x) {
                    System.out.println("x found at location(" + i + "," + j + ")");
                }
            }
        }

        // Output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
