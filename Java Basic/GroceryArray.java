import java.util.Scanner;

public class GroceryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int product = sc.nextInt();
        System.out.println("Enter the number of branches:");
        int branch = sc.nextInt();

        String[] productName = new String[product];
        int[] productPrice = new int[product];
        int[][] productQuantity = new int[product][branch];

        int totalRiceQuantity = 0;
        int totalDalQuantity = 0;
        int totalRicePrice = 0;
        int totalDalPrice = 0;

        for (int i = 0; i < product; i++) {
            System.out.println("Enter the name of the product:");
            productName[i] = sc.next();
            System.out.println("Enter the price of the " + productName[i] + ":");
            productPrice[i] = sc.nextInt();

            for (int j = 0; j < branch; j++) {
                System.out.println("Enter the quantity of " + productName[i] + " in branch " + (j + 1) + ":");
                productQuantity[i][j] = sc.nextInt();
            }

            int totalQuantity = 0;
            for (int j = 0; j < branch; j++) {
                totalQuantity += productQuantity[i][j];
            }

            if (productName[i].equalsIgnoreCase("rice")) {
                totalRiceQuantity += totalQuantity;
                totalRicePrice += totalQuantity * productPrice[i];
            } else if (productName[i].equalsIgnoreCase("dal")) {
                totalDalQuantity += totalQuantity;
                totalDalPrice += totalQuantity * productPrice[i];
            }
        }

        System.out.println("Total Quantity of Rice: " + totalRiceQuantity);
        System.out.println("Total Price of Rice: " + totalRicePrice);
        System.out.println("Total Quantity of Dal: " + totalDalQuantity);
        System.out.println("Total Price of Dal: " + totalDalPrice);
        sc.close();
    }
}