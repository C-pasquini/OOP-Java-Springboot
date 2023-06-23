package com.example.project.product.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {
    String name;
    String description;
    double price;
    int id;
}
