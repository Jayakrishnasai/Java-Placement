import java.util.*;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int cols = sc.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print("Enter the Element of Matrix 1 at position [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print("Enter the Element of Matrix 2 at position [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
        // display matrix1
        System.out.println("\nMatrix 1: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length;j++) {
                System.out.println(matrix1[i][j] + " ");
            }
            System.out.println(" ");
        }
        // display matrix2
        System.out.println("\nMatrix 2: ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length;j++) {
                System.out.println(matrix2[i][j] + " ");
            }
            System.out.println(" ");
        }
        // sum the two matrix
        System.out.println("The Sum of Two Matrix is : ");
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.println(sumMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        sc.close();
    }
}