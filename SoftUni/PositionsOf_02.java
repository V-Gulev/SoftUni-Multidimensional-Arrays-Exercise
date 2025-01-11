package SoftUni;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] size = sc.nextLine().split("\\s+");
        int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            int[] currentRow = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = currentRow;
        }
        int searchNumber = Integer.parseInt(sc.nextLine());
        boolean isFound = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchNumber) {
                    isFound = true;
                    System.out.println(i + " " + j);
                }
            }
        }


        if (!isFound) System.out.println("not found");
    }
}
