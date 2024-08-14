// Base class
class Vehicle2 {
     String brand = "Ford";
 
     public void honk() {
         System.out.println("Beep beep!");
     }
 }
 
 // Derived Class 1
 class Car2 extends Vehicle2 {
     String modelName = "Mustang";
 }
 
 // Derived Class 2
 class Bike extends Vehicle2 {
     String bikeType = "Sport";
 }
     
 public class hierarichalInheritance {
 
 
     public static void main(String[] args) {
         Bike myBike = new Bike();
         myBike.honk();  // Inherited Class
         System.out.println(myBike.brand + " " + myBike.bikeType);
 
         Car2 myCar = new Car2();
         System.out.println(myCar.brand + " " + myCar.modelName);
     }
 }