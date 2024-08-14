// You Have a theater with seating Arrangment representing 2D array. Each Element in the Array represents a seat. 0 indicates empty seat.
// 1 indicates Occupied. Write a java program to find the number of Empty seats
import java.util.*;
public class SeatArrangement {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int [][] Theater1 = new int[3][4];
        int [][] Theater2 = new int[4][4];
        // Initialize the seats in Theater1
        System.out.println("Current Status of theater1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Theater1[i][j]+" ");
            }
            System.out.println(" ");
        }
        // Initialize the Seats in Theater2
        System.out.println("Current Status of theater2: ");
        for (int i = 0; i < 4; i++) {
            for (int j =0; j < 4; j++) {
                System.out.print(Theater2[i][j]+" ");
            }
            System.out.println(" ");
        }
        //Update the Particular index as 1 - seat Occupied in both theatre
        while (true) {
            System.out.print("Enter the theatre number (1 or 2): ");
            int theatreNumber = sc.nextInt();
            System.out.print("Enter the row index to book (0-" + (theatreNumber == 1? 2 : 4) + "): ");
            int r = sc.nextInt();
            System.out.print("Enter the column index to book (0-3): ");
            int c = sc.nextInt();
            if (theatreNumber == 1) {
                if (Theater1[r][c] == 0) {
                    Theater1[r][c] = 1; 
                    System.out.println("Seat booked successfully!");
                } else {
                    System.out.println("Seat already booked. Please try again.");
                }
            } else if (theatreNumber == 2) {
                if (Theater2[r][c] == 0) {
                    Theater2[r][c] = 1; 
                    System.out.println("Seat booked successfully!");
                } else {
                    System.out.println("Seat already booked. Please try again.");
                }
            }

            System.out.println("Current seating arrangement of Theatre 1:");
            printTheatre(Theater1);
            System.out.println("Current seating arrangement of Theatre 2:");
            printTheatre(Theater2);
        }
    }

    public static void printTheatre(int[][] theatre) {
        for (int i = 0; i < theatre.length; i++) {
            for (int j = 0; j < theatre[i].length; j++) {
                System.out.print(theatre[i][j] + " ");
            }
            System.out.println();
        } 
    }
}
