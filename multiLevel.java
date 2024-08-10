// Base Class
class vehicle1 {
    String brand = "Benz";

    public void honk() {
        System.out.println("Honk Honk");
    }
}

// Derived Class
class car1 extends vehicle1 {
    String modelName = "A - Class";
}

// Further Derived Class
class raceCar extends car1 {
    int topSpeed = 400;
}

public class multiLevel {
    public static void main(String[] args) {
        raceCar myraceCar = new raceCar();
        myraceCar.honk();
        System.out.println("Brand: " + myraceCar.brand + " " + myraceCar.modelName + " with topspeed" + " " + myraceCar.topSpeed + "KMPH" );
    }
}