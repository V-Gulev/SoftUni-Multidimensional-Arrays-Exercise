package SoftUni;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] size = sc.nextLine().split(",\\s+");
        int[][] matrix = fillMatrix(size, sc);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(calculateSum(matrix));

    }

    private static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
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
