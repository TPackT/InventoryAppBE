package io.github.tpackt.inventoryapp.model;

public class Product {

    private static int idSerial = 1;

    private String id;
    private String barcode;
    private String name;
    private int price;
    private int quantity;
    private String desc;
    private String category;
    private String createdTs;
    private String updatedTs;


    public Product() {
        this.id = String.valueOf(idSerial);
        idSerial++;
    }

    public Product(String id) {
        this.id = id;

    }

    public Product(String id, String barcode, String name, String size, int price, int quantity, String desc, String category, String createdTs, String updatedTs) {
        this.id = String.valueOf(idSerial);
        idSerial++;
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.desc = desc;
        this.category = category;
        this.createdTs = createdTs;
        this.updatedTs = updatedTs;
    }


    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(){
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName() {
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

    public String getCategory() {
        return category;
    }

    public String getCreatedTs() {
        return createdTs;
    }

    public String getUpdatedTs() {
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

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCreatedTs(String createdTs) {
        this.createdTs = createdTs;
    }

    public void setUpdatedTs(String updatedTs) {
        this.updatedTs = updatedTs;
    }


}
