package store.model.dto;

import java.time.LocalDate;

public class Selling {
    int id;
    LocalDate date;
    Category category;
    int count;
    int price;

    public Selling(int id, LocalDate date, Category category, int price,int count) {
        this.id = id;
        this.date = date;
        this.category = category;
        this.price = price;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Selling{" +
                "id=" + id +
                ", date=" + date +
                ", category=" + category +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}

