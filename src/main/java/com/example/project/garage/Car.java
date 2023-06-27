package com.example.project.garage;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue
    private long idCar;
    @GeneratedValue
    private String carName;
    @GeneratedValue
    private String carManufacturer;
    @GeneratedValue
    private double price;
}
