import java.util.*;
public class TwoDArrayUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];

        //Take Inputs From User
        System.out.println("Enter The Elements in 3 x 3 Matrix: ");
        for (int i = 0; i < rows ; i++){
            for (int j = 0; j < cols; j++){
                System.out.printf("Enter the Element for [%d][%d]: ",i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
        //Print 2D Matrix
        System.out.println("The 3 x 3 Matrix or Array is: ");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.print("Sum of the Elements is: " + sum);
        sc.close();
    }
}
