package SoftUni;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] size = sc.nextLine().split(",\\s+");
        int[][] matrix = fillMatrix(size, sc);
        int biggestSum = Integer.MIN_VALUE;
        int[][] biggest2x2 = new int[2][2];
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int column = 0; column < matrix[row].length - 1; column++) {
                int sum2x2 = matrix[row][column] + matrix[row][column + 1] + matrix[row + 1][column] + matrix[row + 1][column + 1];
                if (sum2x2 > biggestSum) {
                    biggestSum = sum2x2;
                    biggest2x2[0][0] = matrix[row][column];
                    biggest2x2[0][1] = matrix[row][column + 1];
                    biggest2x2[1][0] = matrix[row + 1][column];
                    biggest2x2[1][1] = matrix[row + 1][column + 1];
                }
            }
        }
        for (int i = 0; i < biggest2x2.length; i++) {
            for (int j = 0; j < biggest2x2[i].length; j++) {
                System.out.print(biggest2x2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(biggestSum);

    }

    private static int[][] fillMatrix(String[] size, Scanner sc) {
        int rows = Integer.parseInt(size[0]);
        int columns = Integer.parseInt(size[1]);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            int[] numbers = Arrays.stream(sc.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = numbers;
        }
        return matrix;
    }

}
