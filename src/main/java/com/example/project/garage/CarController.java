package com.example.project.garage;

import com.example.project.garage.carService.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.SimpleTimeZone;

@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/garage/{manufacturer}")
    public List<Car> getCarManufacturer(@PathVariable String manufacturer) {

        return carService.getCarsByManufacturer(manufacturer);
    }
}
