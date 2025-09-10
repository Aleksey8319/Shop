package Shop;

//Принцип открытости - имплементируя интерфейс Food, мы добавляем классу функциональности, не изменяя его код
public class Bread extends Product implements Food {
    private final String name = "хлеб";
    private final double price = 50;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("Хлеб съеден");
    }
}

