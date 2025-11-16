package store.model.dto;

import java.time.LocalDate;

public class Selling {
    int id;
    String name;
    LocalDate date;
    Category category;
    int count;
    int price;

    public Selling(int id, String name,LocalDate date , Category category, int price,int count) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.category = category;
        this.price = price;
        this.count = count;
    }

    public Selling(Category category, int count, LocalDate date, String name, int price) {
        this.category = category;
        this.count = count;
        this.date = date;
        this.name = name;
        this.price = price;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

