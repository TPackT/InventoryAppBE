package io.github.tpackt.inventoryapp.mapper;

import io.github.tpackt.inventoryapp.dto.ProductResponse;
import io.github.tpackt.inventoryapp.model.Product;
import io.github.tpackt.inventoryapp.dto.ProductRequest;


public class ProductMapper {

    public static Product toEntity(ProductRequest request) {
        Product product = new Product();
        product.setBarcode(request.getBarcode());
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setQuantity(request.getQuantity());
        product.setDesc(request.getDesc());
        product.setCategory(request.getCategory());
        return product;
    }

    public static ProductResponse toDto(Product product) {
        ProductResponse dto = new ProductResponse();
        dto.setId(product.getId());
        dto.setBarcode(product.getBarcode());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setQuantity(product.getQuantity());
        dto.setDesc(product.getDesc());
        dto.setCategory(product.getCategory());
        dto.setCreatedTs(product.getCreatedTs());
        dto.setUpdatedTs(product.getUpdatedTs());
        return dto;
    }
}
