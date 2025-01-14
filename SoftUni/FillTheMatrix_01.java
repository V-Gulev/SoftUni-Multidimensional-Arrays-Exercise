package SoftUni;

import java.util.Scanner;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int size = Integer.parseInt(input.split(", ")[0]);
        String type = input.split(", ")[1];
        int[][] matrix = new int[size][size];
        if (type.equals("A")) {
            fillMatrixTypeA(matrix);
        } else {
            fillMatrixTypeB(matrix);
        }
        printMatrix(matrix);
    }

    private static void fillMatrixTypeA(int[][] matrix) {
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = number;
                number++;
            }
        }

    }

    private static void fillMatrixTypeB(int[][] matrix) {
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = number;
                    number++;
                }
            } else {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[j][i] = number;
                    number++;
                }
            }
        }

    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
