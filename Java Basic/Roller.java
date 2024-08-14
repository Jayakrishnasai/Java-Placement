import java.util.Scanner;
public class Roller {
    public static void main(String[] args) {
        System.out.println("Welcome to ROLLER COASTER Enjoy Your Hearts Content...");
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to ride the roller coaster?");
        String ride = sc.nextLine().trim().toLowerCase();

        if (ride.equals("yes")) {
            System.out.println("How old are you?");
            int age = sc.nextInt();
            sc.nextLine();

            if (age >= 12) {
                System.out.println("Do you want to buy a ticket?");
                String ticket = sc.nextLine().trim().toLowerCase();

                if (ticket.equals("yes")) {
                    System.out.println("How tall are you in inches?");
                    int height = sc.nextInt();
                    sc.nextLine(); 

                    if (height >= 48) {
                        System.out.println("Do you want to take a photo?");
                        String photo = sc.nextLine().trim().toLowerCase();

                        if (photo.equals("yes")) {
                            System.out.println("Here is your photo.");
                            System.out.println("Thank You and Visit Again...! ");
                        } else {
                            System.out.println("No photo taken.");
                            System.out.println("Thank You and Visit Again...! ");

                        }
                    } else {
                        System.out.println("You Height is too low to Ride, Not Eligible");
                    }
                } else {
                    System.out.println("You are not eligible to ride the roller coaster without a ticket.");
                }
            } else {
                System.out.println("You are not eligible to ride the roller coaster Your Age is not Allowd");
            }
        } else {
            System.out.println("Thank you for visiting the roller coaster.");
        }

        sc.close(); 
    }
}