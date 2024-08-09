// Base class
class Vehicle1 {
    String brand = "Ford";
    public void honk() {
        System.out.println("Beep beep!");
    }
}
// Derived class
class Car1 extends Vehicle1 {
    String modelName = "Mustang";
}

// Further derived class
class RaceCar extends Car1 {
    int topSpeed = 200;
}
public class multiLevel {
    public static void main(String[] args) {
        RaceCar myRaceCar = new RaceCar();
        myRaceCar.honk();  // Inherited from Vehicle1
        System.out.println(myRaceCar.brand + " " + myRaceCar.modelName + " with top speed " + myRaceCar.topSpeed + " mph");
    }
}