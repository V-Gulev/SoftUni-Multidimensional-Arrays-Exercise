package SoftUni;

import java.util.*;

public class StringMatrixRotation_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int degrees = Integer.parseInt(sc.nextLine().replace("Rotate(", "").replace(")", ""));
        List<String> words = new ArrayList<>();
        String matrixLine = sc.nextLine();

        while (!matrixLine.equals("END")) {
            words.add(matrixLine);
            matrixLine = sc.nextLine();
        }
        int rows = words.size();
        int columns = Collections.max(words, Comparator.comparing(String::length)).length();
        char[][] matrix = new char[rows][columns];
        fillMatrix(matrix, words);
        int rotations = degrees / 90;

        for (int i = 1; i <= rotations; i++) {
            matrix = rotate90Degrees(matrix);
        }
        printMatrix(matrix);
    }

    private static void fillMatrix(char[][] matrix, List<String> words) {
        for (int i = 0; i < matrix.length; i++) {
            String word = words.get(i);
            for (int j = 0; j < matrix[i].length; j++) {

                if (j <= word.length() - 1) {
                    matrix[i][j] = word.charAt(j);
                } else {
                    matrix[i][j] = ' ';
                }

            }

        }

    }

    private static char[][] rotate90Degrees(char[][] matrix) {
        int rows = matrix[0].length;
        int cols = matrix.length;
        char[][] newMatrix = new char[rows][cols];
        for (int i = 0; i < matrix[0].length; i++) {
            int newColumn = 0;
            for (int j = matrix.length - 1; j >= 0; j--) {
                char currentSymbol = matrix[j][i];
                newMatrix[i][newColumn] = currentSymbol;
                newColumn++;
            }
        }
        return newMatrix;
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

}
