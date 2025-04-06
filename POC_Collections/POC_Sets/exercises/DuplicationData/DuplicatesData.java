package DuplicationData;

import java.util.*;

public class DuplicatesData {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Rice");
        items.add("Pasta");
        items.add("Bread");
        items.add("Milk");
        items.add("Cheese");
        items.add("Eggs");
        items.add("Butter");
        items.add("Sugar");
        items.add("Flour");
        items.add("Chicken");
        items.add("Beef");
        items.add("Fish");
        items.add("Apples");
        items.add("Bananas");
        items.add("Orange juice");
        items.add("Rice");
        items.add("Pasta");
        items.add("Bread");
        items.add("Milk");
        items.add("Cheese");
        items.add("Eggs");
        items.add("Butter");
        items.add("Sugar");
        items.add("Flour");
        items.add("Chicken");
        items.add("Beef");
        items.add("Fish");
        items.add("Apples");
        items.add("Bananas");
        items.add("Orange juice");


        removeDuplicates(items);

        for(var item: items){
            System.out.println(item);
        }

    }
    private static void removeDuplicates(List<String> items){
        //Set<String> set = new HashSet<>(items); //change the insertion order
        //Set<String> set = new TreeSet<>() //organize items
        Set<String> set = new LinkedHashSet<>(items); //not change the insertion order

        items.clear();
        items.addAll(set);
    }
}
