package SoftUni;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] size = sc.nextLine().split("\\s+");
        int firstRows = Integer.parseInt(size[0]);
        int firstCol = Integer.parseInt(size[1]);
        int[][] firstMatrix = new int[firstRows][firstCol];

        fillMatrix(firstMatrix, sc);

        String[] secondSize = sc.nextLine().split("\\s+");
        int secondRows = Integer.parseInt(secondSize[0]);
        int secondCol = Integer.parseInt(secondSize[1]);
        int[][] secondMatrix = new int[secondRows][secondCol];

        fillMatrix(secondMatrix, sc);
        if (isEqual(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        } else System.out.println("not equal");

    }

    private static boolean isEqual(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length) {
            return false;
        }
        if (matrixA[0].length != matrixB[0].length) {
            return false;
        }

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                if (matrixA[i][j] != matrixB[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


    private static void fillMatrix(int[][] matrix, Scanner sc) {
        for (int j = 0; j < matrix.length; j++) {
            int[] currentRow = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            matrix[j] = currentRow;

        }

    }
}
