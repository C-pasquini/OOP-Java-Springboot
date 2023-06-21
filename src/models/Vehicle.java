package models;

public abstract class Vehicle{
    protected int speed;
    public int getSpeed(){
        return this.speed;
    }

    abstract int getNumberOfTires();
}
