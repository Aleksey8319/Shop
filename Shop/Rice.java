package Shop;

public class Rice extends Product implements Food{
    private final String name = "рис";
    private final double price = 253;

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
        System.out.println("Рис съеден");
    }
}

