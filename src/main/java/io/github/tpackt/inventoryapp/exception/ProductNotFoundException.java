package io.github.tpackt.inventoryapp.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id){
        super("Product with id " + id + " not found");
    }
}
