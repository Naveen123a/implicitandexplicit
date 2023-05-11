//Encapsulation: Creating a class with private fields and public methods to access them
class Car {
 private String brand;
 private String model;
 private int year;

 public String getBrand() {
     return brand;
 }

 public void setBrand(String brand) {
     this.brand = brand;
 }

 public String getModel() {
     return model;
 }

 public void setModel(String model) {
     this.model = model;
 }

 public int getYear() {
     return year;
 }

 public void setYear(int year) {
     this.year = year;
 }
}

//Inheritance: Creating a subclass that inherits from the Car class
class ElectricCar extends Car {
 private int batteryCapacity;

 public int getBatteryCapacity() {
     return batteryCapacity;
 }

 public void setBatteryCapacity(int batteryCapacity) {
     this.batteryCapacity = batteryCapacity;
 }
}

//Polymorphism: Using method overriding and dynamic binding
class Vehicle {
 public void startEngine() {
     System.out.println("Engine started.");
 }
}

class Bike extends Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Kickstart the engine.");
 }
}

class Car1 extends Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Turn the key to start the engine.");
 }
}

//Abstraction: Creating an abstract class and its implementation
abstract class Shape {
 public abstract void draw();
}

class Rectangle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a rectangle.");
 }
}

class Circle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a circle.");
 }
}

public class ExaOops {
 public static void main(String[] args) {
     // Creating objects and using encapsulation
     Car car = new Car();
     car.setBrand("Toyota");
     car.setModel("Camry");
     car.setYear(2022);

     System.out.println("Car Details:");
     System.out.println("Brand: " + car.getBrand());
     System.out.println("Model: " + car.getModel());
     System.out.println("Year: " + car.getYear());

     // Inheritance: Creating an ElectricCar object and using inherited properties
     ElectricCar electricCar = new ElectricCar();
     electricCar.setBrand("Tesla");
     electricCar.setModel("Model S");
     electricCar.setYear(2021);
     electricCar.setBatteryCapacity(100);

     System.out.println("Electric Car Details:");
     System.out.println("Brand: " + electricCar.getBrand());
     System.out.println("Model: " + electricCar.getModel());
     System.out.println("Year: " + electricCar.getYear());
     System.out.println("Battery Capacity: " + electricCar.getBatteryCapacity() + " kWh");

     // Polymorphism: Using dynamic binding to invoke different implementations of the startEngine() method
     Vehicle bike = new Bike();
     Vehicle cars = new Car1();

     System.out.println("Starting Bike Engine:");
     bike.startEngine();

     System.out.println("Starting Car Engine:");
     cars.startEngine();

     // Abstraction: Creating Shape objects and using the draw() method
     Shape rectangle = new Rectangle();
     Shape circle = new Circle();

     System.out.println("Drawing Shapes:");
     rectangle.draw();
     circle.draw();
 }
}
