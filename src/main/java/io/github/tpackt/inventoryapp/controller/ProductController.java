package io.github.tpackt.inventoryapp.controller;

import io.github.tpackt.inventoryapp.mapper.ProductMapper;
import io.github.tpackt.inventoryapp.model.Product;
import io.github.tpackt.inventoryapp.service.ProductService;
import io.github.tpackt.inventoryapp.dto.ProductRequest;
import io.github.tpackt.inventoryapp.dto.ProductResponse;
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
    public List<ProductResponse> getProducts() {
        //System.out.println("Routed to products: ");
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public ProductResponse getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    /* //TBD - fetch info from third-party API using barcode

    @PostMapping("/products/search")
    public Product searchProduct(@RequestBody String barcode) {
        return productService.getProductInfo(id);
    }
    */

    @PostMapping("/products")
    public void addProduct(@RequestBody ProductRequest productRequest) {
        productService.addProduct(productRequest);
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody ProductRequest productRequest) {
        productService.updateProduct(id, productRequest);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }


}
