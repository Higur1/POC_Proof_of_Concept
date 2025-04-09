package StreamAPIQueriesOnOrdersAndProducts;

import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Orders {
    public static void main(String[] args) {
        queryA();
        queryB();
        queryC();
        queryD();
        queryE();
    }

    // A) Orders made by each customer
    private static void queryA() {
        OrderDefinition
                .allOrders()
                .stream()
                .collect(Collectors.groupingBy(
                                o -> o.customer().name(),
                                counting()
                        )
                )
                .forEach((k, v) -> System.out.println(k + " ==> " + v));
    }

    //B) Total cost of each order
    private static void queryB() {
        OrderDefinition
                .allOrders()
                .stream()
                .collect(
                        groupingBy(
                                OrderDefinition.Order::id,
                                Collectors.summingDouble(OrderDefinition.Order::price)
                        ))
                .forEach((k, v) -> System.out.println(k + " => " + v));
    }

    //C) Names of customers who bought toys
    private static void queryC() {
        OrderDefinition
                .allOrders()
                .stream()
                .filter(
                        o -> o.products()
                                .stream()
                                .anyMatch(
                                        p -> p.category() == OrderDefinition.Category.TOY
                                )
                ).map(o -> o.customer().name())
                .distinct()
                .forEach(System.out::println);
    }

    //D) Order IDs with total price above 500, sorted by date
    private static void queryD() {


        OrderDefinition
                .allOrders()
                .stream()
                .filter(o -> o.price() > 500)
                .sorted(Comparator.comparing(OrderDefinition.Order::orderDate))
                .mapToLong(OrderDefinition.Order::id)
                .forEach(System.out::println);
    }

    //E) Total amount paid by each customer across all their orders
    private static void queryE() {
        OrderDefinition
                .allOrders()
                .stream()
                .collect(
                        groupingBy(
                                o -> o.customer().name(),
                                summingDouble(OrderDefinition.Order::price)
                        )
                )
                .forEach((k, v) -> System.out.println(k + " ==> " + v));
    }
}
