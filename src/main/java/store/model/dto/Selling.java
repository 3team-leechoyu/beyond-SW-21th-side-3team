package store.model.dto;

import java.time.LocalDate;

public class Selling {
    int id;
    String name;
    LocalDate date;
    int categoryId;
    int count;
    int price;

    public Selling() {}

    public Selling(int categoryId, int count, LocalDate date, int id, String name, int price) {
        this.categoryId = categoryId;
        this.count = count;
        this.date = date;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}

