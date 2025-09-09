package Shop;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Product> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public void addProduct (Product product) {
        products.add(product);
    }

    public void removeProductName (String productName) {
        for (Product p : products) {
            if (p.getName().equals(productName)) {
                products.remove(p);
                return;
            }
        }
    }

    public double totalCost () {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        return sum;
    }


    @Override
    public String toString() {
        if (products.isEmpty()) {
            return "Корзина пуста";
        }
        StringBuilder sb = new StringBuilder("Продукты в корзине:\n");
        for (Product p : products) {
            sb.append(p.getName()).append(": ").append(p.getPrice()).append(";\n");
        }
        sb.append("Общая сумма: ").append(totalCost());
        return sb.toString();
    }
}
