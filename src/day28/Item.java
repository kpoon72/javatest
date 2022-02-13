package day28;

import java.util.Objects;

public class Item {
    private String name;
    private String type;
    private int price;
    private int year;

    public Item(String name, String type, int price, int year) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price && year == item.year && Objects.equals(name, item.name) && Objects.equals(type, item.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, price, year);
    }
}
