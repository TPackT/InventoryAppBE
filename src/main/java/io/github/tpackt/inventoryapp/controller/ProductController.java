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

    @GetMapping("/")
    public String index() {
        return "Inventory App is running!";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        //System.out.println("Routed to products: ");

        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody Product product) {
        productService.updateProduct(id, product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }


}
