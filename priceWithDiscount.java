//if price is lessthan 50 then apply 10% discount
//if price is Greaterthan 50 and less than 75 then apply 15% discount
//if price is Greater then 75 and lessthan 90 then apply 20% discount
//if price is Greater than 90 and lessthan or wqual to 100 then apply 25% discount
// Now Take 3 to 4 products with cost and Calculate total sum
// Now apply discount based on the price of the product
import java.util.*;
public class priceWithDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the price of the product " + (i + 1) + ": ");
            int productPrice = sc.nextInt();
            total += productPrice;
        }
        System.out.println("The Total Amount is : "+total);
        if (total < 50) {
            System.out.println("Discount is 10%");
            System.out.print("Total after discount is " + (total - (total * 10 / 100)));
            } else if (total >= 50 && total < 75) {
                System.out.println("Discount is 15%");
                System.out.print("Total after discount is " + (total - (total * 15 / 100)));
                } else if (total >= 75 && total < 90) {
                    System.out.println("Discount is 20%");
                    System.out.print("Total after discount is " + (total - (total * 20 / 100)));
                    } else if (total >= 90) {
                        System.out.println("Discount is 25%");
                        System.out.print("Total after discount is " + (total - (total * 25 / 100)));
                    }
        sc.close();
    }
}
