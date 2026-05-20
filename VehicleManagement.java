/*
Develop a vehicle management system using inheritance.
Vehicles: Car, Truck, Motorcycle
*/

class Vehicle {

    String make;
    String model;
    int year;

    // Constructor
    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Display common details
    void display() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }
}

// Car class
class Car extends Vehicle {

    int seatingCapacity;

    Car(String make, String model, int year, int seatingCapacity) {
        super(make, model, year);
        this.seatingCapacity = seatingCapacity;
    }

    void showCar() {
        display();
        System.out.println("Seating Capacity : " + seatingCapacity);
    }
}

// Truck class
class Truck extends Vehicle {

    int cargoCapacity;

    Truck(String make, String model, int year, int cargoCapacity) {
        super(make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    void showTruck() {
        display();
        System.out.println("Cargo Capacity : " + cargoCapacity + " tons");
    }
}

// Motorcycle class
class Motorcycle extends Vehicle {

    int engineCapacity;

    Motorcycle(String make, String model, int year, int engineCapacity) {
        super(make, model, year);
        this.engineCapacity = engineCapacity;
    }

    void showBike() {
        display();
        System.out.println("Engine Capacity : " + engineCapacity + " cc");
    }
}

// Main class
public class VehicleManagement {

    public static void main(String[] args) {

        Car c = new Car("Hyundai", "i20", 2023, 5);

        Truck t = new Truck("Tata", "Signa", 2022, 10);

        Motorcycle m = new Motorcycle("Honda", "Shine", 2024, 125);

        System.out.println("----- Car Details -----");
        c.showCar();

        System.out.println("\n----- Truck Details -----");
        t.showTruck();

        System.out.println("\n----- Motorcycle Details -----");
        m.showBike();
    }
}