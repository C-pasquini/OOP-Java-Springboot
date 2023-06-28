package com.example.project.garage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT c FROM Car c WHERE c.carManufacturer = ?1")
    public List<Car> getCarsByManufacturer(String manufacturer);

    @Query("SELECT c FROM Car C WHERE c.idCar = ?1")
    public void setCarFuelLevelById(Long id, double fuel);
}
