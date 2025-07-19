package io.github.tpackt.inventoryapp.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "products")
public class Product {

    //private static int idSerial = 1; --pre-database
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "description")
    private String desc;

    @Column(name = "category_id")
    private int category;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdTs;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedTs;


    public Product() {
        /*
        this.id = String.valueOf(idSerial);
        idSerial++;
        */ //pre-database

    }

    public Product(Long id) {
        this.id = id;

    }

    public Product(Long id, String barcode, String name, String size, int price, int quantity, String desc, int category, LocalDateTime createdTs, LocalDateTime updatedTs) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.desc = desc;
        this.category = category;
        this.createdTs = createdTs;
        this.updatedTs = updatedTs;
    }


    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode){
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDesc() {
        return desc;
    }

    public int getCategory() {
        return category;
    }

    public LocalDateTime getCreatedTs() {
        return createdTs;
    }

    public LocalDateTime getUpdatedTs() {
        return updatedTs;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setCreatedTs(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }

    public void setUpdatedTs(LocalDateTime updatedTs) {
        this.updatedTs = updatedTs;
    }


}
