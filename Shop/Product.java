package Shop;

import java.util.List;

public class Product {
    private String name;
    private double price;


    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) throws Exception {
        if (!this.name.equals(name)) {
            this.name = name;
        } else {
            throw new Exception("Такой продукт уже существует");
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Продукт: " + name + ", стоимость: " + price + " руб." + '\n';
    }
}
