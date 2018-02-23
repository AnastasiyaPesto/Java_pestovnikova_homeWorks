package ru.pestovnikova.Lesson10;

public class Product {
    private String title;
    private Category category;
    private int quantityStock;
    private float weight;
    private float price;

    public Product(String title, Category category, int quantityStock, float weight, float price) {
        this.title = title;
        this.category = category;
        this.quantityStock = quantityStock;
        this.weight = weight;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
