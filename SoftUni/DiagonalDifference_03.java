package SoftUni;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[size][size];
        fillMatrix(matrix, sc);
        sumDiagonals(matrix);

    }

    private static void fillMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
    }

    private static void sumDiagonals(int[][] matrix) {
        int sumDiagonalA = 0;
        int sumDiagonalB = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumDiagonalA += matrix[i][i];
        }

        for (int i = 1; i <= matrix.length; i++) {
            sumDiagonalB += matrix[i - 1][matrix.length - i];
        }
        System.out.println(Math.abs(sumDiagonalA - sumDiagonalB));
    }

}
