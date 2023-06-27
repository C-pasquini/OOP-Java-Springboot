package com.example.project.garage.carService;

import com.example.project.garage.Car;
import com.example.project.garage.CarRepository;

import java.util.List;

public class CarServiceimpl implements CarService{

    private final CarRepository carRepository;

    public CarServiceimpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car getCar(Long id) {
        return null;
    }

    @Override
    public List<Car> getAllCars() {
        return null;
    }

    @Override
    public Car updateCar(Car car) {
        return null;
    }

    @Override
    public void deleteCar(Long id) {

    }
}
