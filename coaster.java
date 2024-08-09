import java.util.Scanner;

class RollerCoaster {
    private int age;
    private int height;
    private boolean hasTicket;
    private boolean wantsPhoto;

    public RollerCoaster(int age, int height, boolean hasTicket, boolean wantsPhoto) {
        this.age = age;
        this.height = height;
        this.hasTicket = hasTicket;
        this.wantsPhoto = wantsPhoto;
    }

    public boolean isEligibleToRide() {
        return age >= 12 && height >= 48 && hasTicket;
    }

    public void takePhoto() {
        if (wantsPhoto) {
            System.out.println("Photo Bill is $3");
        }
    }
}

public class coaster {
    public static void main(String[] args) {
        System.out.println("Welcome to ROLLER COASTER Enjoy Your Hearts Content...");
        Scanner sc = new Scanner(System.in);

        if (askUserIfTheyWantToRide(sc)) {
            int age = askUserForAge(sc);
            boolean hasTicket = askUserIfTheyWantToBuyATicket(sc);
            int height = askUserForHeight(sc);
            boolean wantsPhoto = askUserIfTheyWantToTakeAPhoto(sc);

            RollerCoaster rollerCoaster = new RollerCoaster(age, height, hasTicket, wantsPhoto);

            if (rollerCoaster.isEligibleToRide()) {
                rollerCoaster.takePhoto();
                System.out.println("Thank You and Visit Again...! ");
            } else {
                System.out.println("You are not eligible to ride the roller coaster.");
            }
        } else {
            System.out.println("Thank you for visiting the roller coaster.");
        }

        sc.close();
    }

    private static boolean askUserIfTheyWantToRide(Scanner sc) {
        System.out.println("Do you want to ride the roller coaster?");
        String ride = sc.nextLine().trim().toLowerCase();
        return ride.equals("yes");
    }

    private static int askUserForAge(Scanner sc) {
        System.out.println("How old are you?");
        return sc.nextInt();
    }

    private static boolean askUserIfTheyWantToBuyATicket(Scanner sc) {
        System.out.println("Do you want to buy a ticket?");
        String ticket = sc.next().trim().toLowerCase();
        return ticket.equals("yes");
    }

    private static int askUserForHeight(Scanner sc) {
        System.out.println("How tall are you in inches?");
        return sc.nextInt();
    }

    private static boolean askUserIfTheyWantToTakeAPhoto(Scanner sc) {
        System.out.println("Do you want to take a photo?");
        String photo = sc.next().trim().toLowerCase();
        return photo.equals("yes");
    }
}