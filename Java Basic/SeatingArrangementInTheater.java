// You Have a theater with seating Arrangment representing 2D array. Each Element in the Array represents a seat. 0 indicates empty seat.
// 1 indicates Occupied. Write a java program to find the number of Empty seats
import java.util.*;
public class SeatingArrangementInTheater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No.of Rows in Theater: ");
        int rows = sc.nextInt();
        System.out.print("Enter the No.of Columns in Theater: ");
        int cols = sc.nextInt();
        int[][] seats = new int[rows][cols];
        
        System.out.println("Enter The Seats in Rows and Columns: ");
        for (int i = 0; i < rows ; i++){
            for (int j = 0; j < cols; j++){
                System.out.printf("Enter the seat number for [%d][%d]: ",i,j);
                seats[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Seating Arragement in Theater is: ");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println(" ");
        }
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (seats[i][j] == 0) {
                    count++;
                }
            }
            System.out.println("The number of Empty Seats in Theater Row " + (i + 1) + " : " + count);
        }
        System.out.print("The number of Empty Seats in Theater: "+count);
        sc.close();
    }
}
