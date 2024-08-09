class Vehical {
    String brand = "Benz";
    public void horn() {
        System.out.println("Beep Beep ! Horn is Working");
    }
} // Derived Class
    class car extends Vehical {
    String modelName = "BZ1100";
    public static void main(String[] args) {
        car myCar = new car();
        myCar.horn();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

public class singleInheritance {
    // Base clase
    public static void main(String[] args) {
    car mycar = new car();
    mycar.horn(); //inherited class
    System.out.println(mycar.brand + " " + mycar.modelName);
    }
}
