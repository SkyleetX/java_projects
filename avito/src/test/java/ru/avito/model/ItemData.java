package ru.avito.model;

public class ItemData {

    private String title;
    private int price;

    public String getTitle() {
        return title;
    }

    public ItemData withTitle(String title) {
        this.title = title;
        return this;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ItemData{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public ItemData withPrice(int price) {
        this.price = price;
        return this;
    }
}
