package io.github.tpackt.inventoryapp.controller;

import io.github.tpackt.inventoryapp.service.ProductService;
import io.github.tpackt.inventoryapp.dto.ProductRequest;
import io.github.tpackt.inventoryapp.dto.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<ProductResponse>> getProducts() {
        //System.out.println("Routed to products: ");
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProducts());
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProduct(id));
    }

    /* //TBD - fetch info from third-party API using barcode

    @PostMapping("/products/search")
    public Product searchProduct(@RequestBody String barcode) {
        return productService.getProductInfo(id);
    }
    */

    @PostMapping("/products")
    public ResponseEntity<Void> addProduct(@RequestBody ProductRequest productRequest) {
        productService.addProduct(productRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
        //return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity <Void> updateProduct(@PathVariable Long id, @RequestBody ProductRequest productRequest) {
        productService.updateProduct(id, productRequest);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
