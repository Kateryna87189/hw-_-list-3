/*


# 3 Чуть сложнее
Допустим, мы пишем программу для онлайн магазина.
Программа выводит на экран список товаров (каждый товар имеет номер, название и цену).
Пользователь, используя сканнер вводит номера товаров,
тем самым добавляя их к себе в корзину.
Как только пользователь заканчивает ввод (например , вместо номера товара вводит 0)
программа выдает список покупок.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) {
        List<Products> products = of(
                new Products(1, "Laptop", 1000.0),
                new Products(2, "Smartphone", 500.0),
                new Products(3, "Headphones", 100.0),
                new Products(4, "Monitor", 200.0),
                new Products(5, "Mouse", 25.0)
        );

        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> cart = new ArrayList<>();

        System.out.println("Доступні продукти:");
        for (Products product: products) {
            System.out.println(products);
        }

        while (true) {
            System.out.print("Натисни номер продукту в картці (або 0 для завершення): ");
            int productId = scanner.nextInt();

            if (productId == 0) {
                break;
            }

            Products selectedProduct = null;
            for (Products product : products) {
                if (product.getId() == productId) {
                    selectedProduct = product;
                    break;
                }
            }

            if (selectedProduct != null) {
                boolean add = cart.add(selectedProduct);

                    System.out.println("Введення в кошику: " + selectedProduct);

            } else {
                System.out.println("товар не знайдений.");
            }
        }

        System.out.println("Ваш кошик:");
        for (Object product : cart) {
            System.out.println(product);
        }
    }
}
