package io.github.tpackt.inventoryapp.service;

import io.github.tpackt.inventoryapp.repository.ProductRepository;
import io.github.tpackt.inventoryapp.model.Product;
import io.github.tpackt.inventoryapp.dto.ProductRequest;
import io.github.tpackt.inventoryapp.dto.ProductResponse;
import io.github.tpackt.inventoryapp.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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

    public List<ProductResponse> getProducts() {
        //return products; --without db

        List<Product> products = new ArrayList<>();
        return productRepository.findAll().stream()
                .map(ProductMapper::toDto)
                .collect(Collectors.toList());
    }

    public ProductResponse getProduct(Long id){
        //return products.stream().filter(p -> p.getId().equals(id)).findFirst().get(); --without db

        return productRepository.findById(id)
                .map(ProductMapper::toDto)
                .orElse(null);
    }

    public void addProduct(ProductRequest productRequest) {
        //products.add(product); --without db
        Product product = ProductMapper.toEntity(productRequest);
        productRepository.save(product);
    }

    public void updateProduct(Long prevId, ProductRequest updatedRequest) {
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

        prevProduct.setName(updatedRequest.getName());
        prevProduct.setBarcode(updatedRequest.getBarcode());
        prevProduct.setPrice(updatedRequest.getPrice());
        prevProduct.setQuantity(updatedRequest.getQuantity());
        prevProduct.setDesc(updatedRequest.getDesc());
        prevProduct.setCategory(updatedRequest.getCategory());


        productRepository.save(prevProduct);

    }

    public void deleteProduct(Long id) {
        // products.removeIf(t -> t.getId().equals(id)); --without db
        productRepository.deleteById(id);
    }


}
