class Car3 {
    public void drive() {
        System.out.println("Driving a car!");
    }
}

// Second Level Class extending Car
class SmartVehicle extends Car3 {
    public void autonomousDrive() {
        System.out.println("Self-driving mode activated!");
    }
}

// Top-level class containing the main method
public class hybridInheritance {
    public static void main(String[] args) {
        SmartVehicle mySmartVehicle = new SmartVehicle();
        mySmartVehicle.drive();  // Inherited from Car
        mySmartVehicle.autonomousDrive();  // Own method
    }
}