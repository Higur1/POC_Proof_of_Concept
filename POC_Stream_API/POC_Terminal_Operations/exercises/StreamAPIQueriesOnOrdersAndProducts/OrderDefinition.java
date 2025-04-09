package StreamAPIQueriesOnOrdersAndProducts;

import java.time.LocalDate;
import java.util.List;

public class OrderDefinition {
    public record Product(String name, Category category, double price) {
    }

    public record Order(Long id, Customer customer, List<Product> products, LocalDate orderDate) {
        public double price() {
            return products.stream().mapToDouble(Product::price).sum();
        }
    }

    public record Customer(String name) {
    }

    public enum Category {
        TOY,
        ELECTRONIC,
        STATIONARY
    }

    public static List<Order> allOrders() {
        var customer1 = new Customer("Pedro");
        var customer2 = new Customer("Maria");
        var customer3 = new Customer("Ricardo");

        var product1 = new Product("Cell phone", Category.ELECTRONIC, 950.0);
        var product2 = new Product("Television", Category.ELECTRONIC, 875.0);
        var product3 = new Product("Teddy Bear", Category.TOY, 85);
        var product4 = new Product("Castle", Category.TOY, 79.0);
        var product5 = new Product("A4 Paper", Category.STATIONARY, 22.0);
        var product6 = new Product("Pencil", Category.STATIONARY, 2.0);

        var order1 = new Order(
                1L, customer1, List.of(product1, product5, product6), LocalDate.of(2030, 5, 1)
        );
        var order2 = new Order(
                2L, customer2, List.of(product2), LocalDate.of(2030, 3, 25)
        );
        var order3 = new Order(
                3L, customer3, List.of(product3, product4, product6), LocalDate.of(2030, 4, 20)
        );
        var order4 = new Order(
                4L, customer2, List.of(product4, product5), LocalDate.of(2030, 4, 11)
        );
        var order5 = new Order(
                5L, customer3, List.of(product1), LocalDate.of(2030, 7, 17)
        );

        return List.of(order1, order2, order3, order4, order5);
    }
}
