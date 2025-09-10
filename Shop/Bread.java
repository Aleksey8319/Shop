package Shop;

// Принцип единственной ответственности - класс Bread описывает только хлеб, а не все продукты
// Принцип замены Барбары Лисков - наследники класса Product полностью играют роль предка
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



