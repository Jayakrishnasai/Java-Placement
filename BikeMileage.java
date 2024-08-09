import java.util.*;
public class BikeMileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Biles Milege (Km/L) : ");
        int milege = sc.nextInt();
        System.out.print("Enter the Amt. of Petrol or Gas you Used (Litres): ");
        int petrol = sc.nextInt();
        double Distance = (double)milege * petrol;
        System.out.println(" Formula: Total Distance * Total Fuel Consumption "+ Distance +" " + "Miles" + "*" + petrol + "Ltr");
        System.out.println("The Total Mileage you Travaled is: " + Distance +" "+ "Km/Ltr");
        sc.close();
    }
}
