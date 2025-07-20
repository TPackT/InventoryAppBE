package io.github.tpackt.inventoryapp.dto;

import java.time.LocalDateTime;

public class ProductResponse {
    private Long id;
    private String barcode;
    private String name;
    private int price;
    private int quantity;
    private String desc;
    private int category;
    private LocalDateTime createdTs;
    private LocalDateTime updatedTs;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBarcode() { return barcode; }
    public void setBarcode(String barcode) { this.barcode = barcode; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getDesc() { return desc; }
    public void setDesc(String desc) { this.desc = desc; }

    public int getCategory() { return category; }
    public void setCategory(int category) { this.category = category; }

    public LocalDateTime getCreatedTs() { return createdTs; }
    public void setCreatedTs(LocalDateTime createdTs) { this.createdTs = createdTs; }

    public LocalDateTime getUpdatedTs() { return updatedTs; }
    public void setUpdatedTs(LocalDateTime updatedTs) { this.updatedTs = updatedTs; }
}
