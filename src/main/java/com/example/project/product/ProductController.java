package com.example.project.product;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;

public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts(){
        return List.of(
                new Product(),
                new Product(),
                new Product()
        );
    }

    //@GetMapping("/product")
    //public Product getProduct(@PathVariable int id, @PathParam("lang") String name)
}
