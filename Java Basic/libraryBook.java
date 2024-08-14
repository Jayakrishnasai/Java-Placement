import java.util.Scanner;
public class libraryBook {
    String title;
    String author;
    String publisher;
    boolean isRented;
    String rentalDate;
    String returnDate;
    public void settitle(String title) {
        this.title = title;
    }
    public void setauthor(String author) {
        this.author = author;
    }
    public void setpublisher(String publisher) {
        this.publisher = publisher;
    }
    public void rentBook(String rentalDate, String returnDate) {
        this.isRented = true;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }
    public void returnBook() {
        this.isRented = false;
        this.rentalDate = "";
        this.returnDate = "";
    }
    public void displayInfo() {
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book publisher: " + publisher);
        if (isRented) {
            System.out.println("Rental status: Rented");
            System.out.println("Rental date: " + rentalDate);
            System.out.println("Return date: " + returnDate);
        } else {
            System.out.println("Rental status: Available");
        }
    }

    public static void main(String[] args) {
        libraryBook lib = new libraryBook();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Enter book title");
            System.out.println("2. Enter book author");
            System.out.println("3. Enter book publisher");
            System.out.println("4. Rent book");
            System.out.println("5. Return book");
            System.out.println("6. Display book information");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    lib.settitle(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter book author: ");
                    lib.setauthor(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter book publisher: ");
                    lib.setpublisher(sc.nextLine());
                    break;
                case 4:
                    if (!lib.isRented) {
                        System.out.print("Enter rental date: ");
                        String rentalDate = sc.nextLine();
                        System.out.print("Enter return date: ");
                        String returnDate = sc.nextLine();
                        lib.rentBook(rentalDate, returnDate);
                        System.out.println("Book rented successfully!");
                    } else {
                        System.out.println("Book is already rented!");
                    }
                    break;
                case 5:
                    if (lib.isRented) {
                        lib.returnBook();
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Book is not rented!");
                    }
                    break;
                case 6:
                    lib.displayInfo();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        sc.close();
    }
}