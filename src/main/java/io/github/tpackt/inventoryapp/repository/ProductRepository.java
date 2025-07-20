package io.github.tpackt.inventoryapp.repository;

import io.github.tpackt.inventoryapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
