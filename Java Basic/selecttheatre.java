import java.util.Scanner;

public class selecttheatre {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int theatre1[][] = new int[3][4];
        int theatre2[][] = new int[5][4];
        System.out.println("current status of theatre 1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(theatre1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("current status of theatre 2");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
               System.out.print(theatre2[i][j]+" ");
            }
            System.out.println();
        }
        while (true) {
            System.out.print("Enter the theatre number (1 or 2): ");
            int theatreNumber = sc.nextInt();
            System.out.print("Enter the row index to book (0-" + (theatreNumber == 1? 2 : 4) + "): ");
            int r = sc.nextInt();
            System.out.print("Enter the column index to book (0-3): ");
            int c = sc.nextInt();
            if (theatreNumber == 1) {
                if (theatre1[r][c] == 0) {
                    theatre1[r][c] = 1; 
                    System.out.println("Seat booked successfully!");
                } else {
                    System.out.println("Seat already booked. Please try again.");
                }
            } else if (theatreNumber == 2) {
                if (theatre2[r][c] == 0) {
                    theatre2[r][c] = 1; 
                    System.out.println("Seat booked successfully!");
                } else {
                    System.out.println("Seat already booked. Please try again.");
                }
            }
            // sc.close();

            System.out.println("Current seating arrangement of Theatre 1:");
            printTheatre(theatre1);
            System.out.println("Current seating arrangement of Theatre 2:");
            printTheatre(theatre2);
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