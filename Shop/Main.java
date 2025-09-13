package Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Product> listProducts = new ArrayList<>();
    static Basket basket = new Basket();

    public static void main(String[] args) {

        listProducts.add(new Milk());
        listProducts.add(new Bread());
        listProducts.add(new Rice());
        listProducts.add(new Mobile());

        while (true) {
            System.out.println("\nВыберите операцию:" + "\n" +
                    "\n" +
                    "1. Показать доступные товары" + "\n" +
                    "2. Поиск товара по названию или цене" + "\n" +
                    "3. Добавить товар в корзину" + "\n" +
                    "4. Удалить товар из корзины" + "\n" +
                    "5. Посмотреть корзину" + "\n" +
                    "6. Отследить заказ" + "\n" +
                    "7. Выход");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    showListProducts();
                    break;
                case 2:
                    searchByNameOrPrice();
                    break;
                case 3:
                    addToBasket();
                    break;
                case 4:
                    removeFromBasket();
                    break;
                case 5:
                    viewBasket();
                    break;
                case 6:
                    trackOrder();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Введен неверный номер операции!");
            }
        }
    }

    // принцип DRY - вывод списка продуктов на экран выносим в отдельный метод
    private static void showListProducts() {
        if (!listProducts.isEmpty()) {
            // Magic - не используем числа на прямую, используем длину списка
            for (int i = 0; i < listProducts.size(); i++) {
                System.out.println("Продукт: " + listProducts.get(i).getName() + " - Цена: " + listProducts.get(i).getPrice() + " руб.");
            }
        } else {
            System.out.println("Список продуктов пуст.");
        }
    }

    private static void searchByNameOrPrice() {
        System.out.print("Введите название или цену для поиска:  ");
        Scanner scanner = new Scanner(System.in);
        String keyword = scanner.nextLine();
        for (Product product : listProducts) {
            if (product.getName().contains(keyword)) {
                System.out.println("Продукт: " + product.getName() + " - Цена: " + product.getPrice() + " руб.");
            return;
            }
        }
        for (Product product : listProducts) {
            if (product.getPrice() == Integer.parseInt(keyword)) {
                System.out.println("Продукт: " + product.getName() + " - Цена: " + product.getPrice() + " руб.");
            return;
            }
        }
        System.out.println("Продукт не найден.");
    }

    private static void addToBasket() {
        System.out.print("Введите название продукта для добавления в корзину:  ");
        Scanner scanner = new Scanner(System.in);
        String keyword = scanner.nextLine();
        for (Product product : listProducts) {
            if (product.getName().contains(keyword)) {
                basket.addProduct(product);
                System.out.println("Продукт добавлен в корзину.");
                return;
            }
        }
        System.out.println("Продукт не найден.");
    }

    private static void removeFromBasket() {
        System.out.print("Введите название продукта для удаления из корзины:  ");
        Scanner scanner = new Scanner(System.in);
        String keyword = scanner.nextLine();
        if (basket.toString().contains(keyword)) {
            basket.removeProductName(keyword);
            System.out.println("Продукт удален из корзины.");
        } else {
            System.out.println("Продукт не найден.");
        }
    }

    private static void viewBasket() {
        System.out.println(basket.toString());
    }

    private static void trackOrder() {
        System.out.print("Введите номер заказа для отслеживания: ");
        Scanner scanner = new Scanner(System.in);
        String orderId = scanner.nextLine();
        OrderTracker tracker = new OrderTracker(orderId);
        System.out.println("Статус заказа № " + orderId + ": " + tracker.getDeliveryStatus());
    }

}
