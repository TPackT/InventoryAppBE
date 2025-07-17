package io.github.tpackt.inventoryapp.controller;

import io.github.tpackt.inventoryapp.model.Product;
import io.github.tpackt.inventoryapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable String id) {
        return productService.getProduct(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable String id, @RequestBody Product product) {
        productService.updateProduct(id, product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }


}
