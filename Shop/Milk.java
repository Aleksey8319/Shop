package Shop;

public class Milk extends Product implements Food{
    private final String name = "молоко";
    private final double price = 120;

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
        System.out.println("Молоко выпито");
    }
}
