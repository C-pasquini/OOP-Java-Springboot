package com.example.project.garage.carService;

import com.example.project.garage.Car;
import com.example.project.garage.CarRepository;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        val car = carRepository.findById(id);
        return car.orElse(null);
    }
    @Override
    public List<Car> getCarsByManufacturer(String manufacturer){
        return carRepository.getCarsByManufacturer(manufacturer);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car updateCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void setCarFuelLevelById(Long id, double fuel){
        carRepository.setCarFuelLevelById(id, fuel);
    }
    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
