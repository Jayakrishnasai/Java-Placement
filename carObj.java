public class carObj {
    private String brandName;
    private String modelNumber;
    private int year;

    public carObj() {
        this.brandName = "Toyota";
        this.modelNumber = "NS400";
        this.year = 2022;
        System.out.println("Default Constructor Constructed Successful");
    }

    public carObj(String brandName, String modelNumber, int year) {
        this.brandName = brandName; 
        this.modelNumber = modelNumber;
        this.year = year;
        System.out.println("Parameterized Constructor Constructed Successful");
    }

    public carObj(carObj obj) {
        this.brandName = obj.brandName;
        this.modelNumber = obj.modelNumber;
        this.year = obj.year;
        System.out.println("Copy Constructor Constructed Successfully");
    }

    public void displayInfo() {
        System.out.println("Car Name: " + brandName);
        System.out.println("Model Name: " + modelNumber);
        System.out.println("Purchased Year: " + year);
    }

    public static void main(String[] args) {
        carObj car = new carObj();
        car.displayInfo();
        System.out.println();

        carObj car1 = new carObj(car); 
        car1.displayInfo();
        System.out.println();

        carObj car2 = new carObj("Honda", "Civic", 2020);
        car2.displayInfo();
        System.out.println();
    }
}