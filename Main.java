abstract class Vehicle {

    // Abstract methods
    abstract void startEngine();
    abstract void stopEngine();
}

// Car class
class Car extends Vehicle {

    void startEngine() {
        System.out.println("Car engine started.");
    }

    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

// Motorcycle class
class Motorcycle extends Vehicle {

    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Motorcycle bike = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        System.out.println();

        bike.startEngine();
        bike.stopEngine();
    }
}