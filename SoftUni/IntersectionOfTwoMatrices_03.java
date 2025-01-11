package SoftUni;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int columns = Integer.parseInt(sc.nextLine());
        char[][] matrixA = new char[rows][columns];
        char[][] matrixB = new char[rows][columns];
        fillMatrix(matrixA, sc);
        fillMatrix(matrixB, sc);
        checkIntersections(matrixA, matrixB);
    }

    private static void checkIntersections(char[][] matrixA, char[][] matrixB) {

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                if (matrixA[i][j] == matrixB[i][j]) {
                    System.out.print(matrixA[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    private static void fillMatrix(char[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            String currentLine = sc.nextLine().replace(" ", "");
            char[] currentRow = currentLine.toCharArray();
            matrix[i] = currentRow;
        }
    }
}
