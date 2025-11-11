package store.model.dto;

import java.time.LocalDate;

public class Product {
    private String name;
    private Category category;
    private int price;
    private int stock;
    private LocalDate date;

    public Product(Category category, LocalDate date, String name, int price, int stock) {
        this.category = category;
        this.date = date;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
                ", 상품 카테고리 : " + category +
                ", 가격 : " + price +
                ", 보유 수량 : " + stock +
                ", 유통 기한 : " + date;
    }
}
