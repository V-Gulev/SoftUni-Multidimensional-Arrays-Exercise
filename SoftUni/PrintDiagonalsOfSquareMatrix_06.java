package SoftUni;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][n];
        fillMatrix(matrix, sc);
        int[] diagonal1 = new int[n];
        int[] diagonal2 = new int[n];
        for (int i = 0; i < n; i++) {
            diagonal1[i] = matrix[i][i];
            diagonal2[i] = matrix[n - i - 1][i];
        }

        for (int i = 0; i < diagonal1.length; i++) {
            System.out.print(diagonal1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < diagonal2.length; i++) {
            System.out.print(diagonal2[i] + " ");
        }
    }

    private static void fillMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            int[] currentRow = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = currentRow;
        }
    }
}
