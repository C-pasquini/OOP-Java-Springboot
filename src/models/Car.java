package models;

public class Car extends Vehicle{
    public Car(int speed){
        super.speed = speed;
    }

    @Override
    public int getNumberOfTires() {
        return 4;
    }
}
