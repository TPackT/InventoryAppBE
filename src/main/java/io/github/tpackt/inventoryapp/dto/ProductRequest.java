package io.github.tpackt.inventoryapp.dto;

public class ProductRequest {
    private String barcode;
    private String name;
    private int price;
    private int quantity;
    private String desc;
    private int category;


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
}
