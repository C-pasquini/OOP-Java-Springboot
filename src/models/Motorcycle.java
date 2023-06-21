package models;
import models.Vehicle;
public class Motorcycle extends Vehicle{
    public Motorcycle(int speed){
        super.speed = speed;
    }

    @Override
    public int getNumberOfTires(){
        return 2;
    }
}
