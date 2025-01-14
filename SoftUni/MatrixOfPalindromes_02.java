package SoftUni;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        String matrix[][] = new String[rows][columns];
        fillMatrix(matrix);
        printMatrix(matrix);
    }

    private static void fillMatrix(String[][] matrix) {
        int sum = 0;
        StringBuilder result = new StringBuilder();
        char middleChar = 0;
        char sideChar = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = i + j;
                middleChar = (char) (97 + sum);
                sideChar = (char) (97 + i);
                result.append(sideChar);
                result.append(middleChar);
                result.append(sideChar);
                matrix[i][j] = result.toString();
                result = new StringBuilder();
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]).replaceAll("\\[", "")
                    .replaceAll("]", "")
                    .replaceAll(",", ""));
        }


    }
}
