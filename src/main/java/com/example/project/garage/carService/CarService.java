package com.example.project.garage.carService;

import com.example.project.garage.Car;

import java.util.List;

public interface CarService {
    public Car createCar(Car car);

    public Car getCar(Long id);
    public List<Car> getAllCars();

    public List<Car>getCarsByManufacturer(String manufacturer);
    public Car updateCar(Car car);
    public void setCarFuelLevelById(Long id, double fuel);
    public void deleteCar(Long id);
}
