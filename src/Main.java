import models.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(5);
        Motorcycle bike = new Motorcycle(200);

        System.out.println("Car goes at: " + car.getSpeed() + " km/h");
        System.out.println("Motorcycle goes at: " + bike.getSpeed() + " km/h");

        System.out.println("Car has " + car.getNumberOfTires() + " tires");
        System.out.println("Motorcycle has " + bike.getNumberOfTires() + " tires");
    }
}