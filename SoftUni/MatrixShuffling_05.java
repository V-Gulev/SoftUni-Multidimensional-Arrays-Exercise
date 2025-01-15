package SoftUni;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int columns = Integer.parseInt(input.split("\\s+")[1]);
        String[][] matrix = new String[rows][columns];
        fillMatrix(matrix, sc);
        String command = sc.nextLine();

        while (!command.equals("END")) {
            String[] elements = command.split("\\s+");
            if (elements.length != 5 || !elements[0].equals("swap")) {
                System.out.println("Invalid input!");
            } else {
                int row1 = Integer.parseInt(command.split("\\s+")[1]);
                int col1 = Integer.parseInt(command.split("\\s+")[2]);
                int row2 = Integer.parseInt(command.split("\\s+")[3]);
                int col2 = Integer.parseInt(command.split("\\s+")[4]);

                if (row1 >= rows || col1 >= columns || row2 >= rows || col2 >= columns || row1 < 0 || col1 < 0 || row2 < 0 || col2 < 0) {
                    System.out.println("Invalid input!");
                } else {
                    String element1 = matrix[row1][col1];
                    String element2 = matrix[row2][col2];
                    matrix[row1][col1] = element2;
                    matrix[row2][col2] = element1;
                    printMatrix(matrix);
                }
            }


            command = sc.nextLine();
        }


    }

    private static void fillMatrix(String[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = sc.nextLine().split("\\s+");
        }

    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]).replaceAll("\\[", "").replaceAll(",", "").replaceAll("]", ""));
        }
    }

}
