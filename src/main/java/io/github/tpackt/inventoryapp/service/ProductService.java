package io.github.tpackt.inventoryapp.service;

import io.github.tpackt.inventoryapp.repository.ProductRepository;
import io.github.tpackt.inventoryapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /*
    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product("", "5449000006271", "Fanta", "500ml", 25, 50, "description", "beverages", "currentTimestamp", "anotherTimestamp"),
            new Product(),
            new Product()
    ));

     */

    public List<Product> getProducts() {
        //return products; --without db

        List<Product> products = new ArrayList<>();
        productRepository.findAll()
                .forEach(products::add);
        return products;
    }

    public Product getProduct(Long id){
        //return products.stream().filter(p -> p.getId().equals(id)).findFirst().get(); --without db

        return productRepository.findById(id).orElse(null);
    }

    public void addProduct(Product product) {
        //products.add(product); --without db
        productRepository.save(product);
    }

    public void updateProduct(Long prevId, Product updatedProduct) {
        /*
        for(int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getId().equals(id)) {
                products.set(i, product);
                return;
            }
        }
          --without db */
        Product prevProduct = productRepository.findById(prevId).orElseThrow(() -> new RuntimeException("Product not found"));

        prevProduct.setName(updatedProduct.getName());
        prevProduct.setBarcode(updatedProduct.getBarcode());
        prevProduct.setPrice(updatedProduct.getPrice());
        prevProduct.setQuantity(updatedProduct.getQuantity());
        prevProduct.setDesc(updatedProduct.getDesc());
        prevProduct.setCategory(updatedProduct.getCategory());


        productRepository.save(prevProduct);

    }

    public void deleteProduct(Long id) {
        // products.removeIf(t -> t.getId().equals(id)); --without db
        productRepository.deleteById(id);
    }


}
