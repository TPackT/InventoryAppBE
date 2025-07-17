package io.github.tpackt.inventoryapp.service;

import io.github.tpackt.inventoryapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product("", "5449000006271", "Fanta", "500ml", 25, 50, "description", "beverages", "currentTimestamp", "anotherTimestamp"),
            new Product(),
            new Product()
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(String id){
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(String id, Product product) {
        for(int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getId().equals(id)) {
                products.set(i, product);
                return;
            }
        }
    }

    public void deleteProduct(String id) {
        products.removeIf(t -> t.getId().equals(id));
    }
}
