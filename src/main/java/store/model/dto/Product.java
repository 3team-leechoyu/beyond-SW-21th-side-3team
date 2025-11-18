package store.model.dto;

import java.time.LocalDate;

public class Product {
    private String name;
    private int categoryId;
    private String categoryName; // category.name
    private int price;
    private int stock;
    private LocalDate date;

    public Product(){}

    public Product(String name, int categoryId, int price, int stock, LocalDate date) {
        this.name = name;
        this.categoryId = categoryId;
        this.price = price;
        this.stock = stock;
        this.date = date;
    }

    public String getCategoryName() {return categoryName;}

    public void setCategoryName(String categoryName) {this.categoryName = categoryName;}

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "상품 정보   " +
                "상품 명 : " + name +
                ", 상품 카테고리 : " + categoryName +
                ", 가격 : " + price +
                ", 보유 수량 : " + stock +
                ", 유통 기한 : " + date;
    }
}

