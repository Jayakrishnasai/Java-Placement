import java.util.Scanner;
public class GroceryInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int product = sc.nextInt();
        System.out.println("Enter the number of branches:");
        int branche = sc.nextInt();

        int totalricequantity = 0;
        int totaldalquantity = 0;
        int totalriceprice = 0;
        int totaldalprice = 0;

        for (int i = 0; i < product; i++) {
            System.out.println("Enter the name of the product:");
            String name = sc.next();
            System.out.println("Enter the price of the " + name + ":");
            int price = sc.nextInt();

            int quantityBranch1 = 0;
            int quantityBranch2 = 0;

            for (int j = 0; j < branche; j++) {
                if (j == 0) {
                    System.out.println("Enter the quantity of " + name + " in branch 1:");
                } else {
                    System.out.println("Enter the quantity of " + name + " in branch 2:");
                }
                int quantity = sc.nextInt();

                if (j == 0) {
                    quantityBranch1 = quantity;
                } else {
                    quantityBranch2 = quantity;
                }
            }

            int totalQuantity = quantityBranch1 + quantityBranch2;

            if (name.equalsIgnoreCase("rice")) {
                totalricequantity += totalQuantity;
                totalriceprice += totalQuantity * price;
            } else if (name.equalsIgnoreCase("dal")) {
                totaldalquantity += totalQuantity;
                totaldalprice += totalQuantity * price;
            }
        }

        System.out.println("Total Quantity of Rice: " + totalricequantity);
        System.out.println("Total Price of Rice: " + totalriceprice);
        System.out.println("Total Quantity of Dal: " + totaldalquantity);
        System.out.println("Total Price of Dal: " + totaldalprice);
        sc.close();
    }
}