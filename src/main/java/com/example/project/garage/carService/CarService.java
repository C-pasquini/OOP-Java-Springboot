package com.example.project.garage.carService;

import com.example.project.garage.Car;

import java.util.List;

public interface CarService {
    Car createCar(Car car);

    Car getCar(Long id);
    List<Car> getAllCars();

    Car updateCar(Car car);

    void deleteCar(Long id);
}
