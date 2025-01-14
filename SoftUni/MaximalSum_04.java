package SoftUni;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int columns = Integer.parseInt(input.split("\\s+")[1]);
        int[][] matrix = new int[rows][columns];
        fillMatrix(matrix, sc);

        int maxSum = Integer.MIN_VALUE;
        int rowIndex = 0;
        int columnIndex = 0;

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int sum = calculate3x3Sum(i, j, matrix);

                if (sum > maxSum) {
                    maxSum = sum;
                    rowIndex = i;
                    columnIndex = j;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int i = rowIndex; i < rowIndex + 3; i++) {
            for (int j = columnIndex; j < columnIndex + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void fillMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
    }

    private static int calculate3x3Sum(int rowIndex, int columnIndex, int[][] matrix) {
        int sum = 0;
        for (int i = rowIndex; i < rowIndex + 3; i++) {
            for (int j = columnIndex; j < columnIndex + 3; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
