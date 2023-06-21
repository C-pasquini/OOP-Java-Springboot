package models;

public abstract class Vehicle{
    protected int speed;
    int getSpeed(){
        return this.speed;
    }

    abstract int getNumberOfTires();
}
