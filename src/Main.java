/*


# 3 Чуть сложнее
Допустим, мы пишем программу для онлайн магазина.
Программа выводит на экран список товаров (каждый товар имеет номер, название и цену).
Пользователь, используя сканнер вводит номера товаров,
тем самым добавляя их к себе в корзину.
Как только пользователь заканчивает ввод (например , вместо номера товара вводит 0)
программа выдает список покупок.
*/

import java.util.List;

import static java.util.List.*;

public class Main {
    public static void main(String[] args) {

        List<Store> products = of(
                new Store("Laptop", 1, 1000),
                new Store("Smartphone", 2, 500),
                new Store("Headphones", 3, 100),
                new Store("Monitor", 4, 200),
                new Store("Mouse", 5, 25)
        );

    }
}
