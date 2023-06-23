package com.example.project.product.presentation;
import com.example.project.product.models.Product;
import java.util.List;


import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts(){
        return List.of(
                new Product("Prodotto 1", "Descr. del Prodotto 1", 5.00, 1),
                new Product("Prodotto 2", "Descr. del Prodotto 2", 10.00,2),
                new Product("Prodotto 3", "Descr. del Prodotto 3", 15.00,3)
        );
    }

    //@GetMapping("/product")
    //public Product getProduct(@PathVariable int id, @PathParam("lang") String name)
}
