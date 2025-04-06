package ItemPriceAnalysis;

//Create a class *Item* with the attributes name and price.
//Create a method that received an array of Item and returns a new array with three prices of information:
    //The item with the lowest price
    //The item with the highest price
    //The avarage price of the items in the array

public class ExerciseTwo {
    public static void main(String[] args) {
        Item[] items = new Item[3];
        items[0] =  new Item("Book", 3.5);
        items[1] = new Item("Car", 2000);
        items[2] = new Item("Cake", 15);

        Object[] res = valueItem(items);

        Item min = (Item) res[0];
        Item max = (Item) res[1];
        Double avg = (Double) res[2];

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Avg: " + avg);

    }

    private static Object[] valueItem(Item... items){
        Item min = items[0];
        Item max = items[0];
        double averageValue = 0.0;
        for(Item item: items){
            if(item.getPrice() < min.getPrice()){
                min = item;
            }
            if(item.getPrice() > max.getPrice()){
                max = item;
            }
            averageValue += item.getPrice();
        }
        double avg = averageValue / items.length;
        return new Object[]{min, max, avg};
    }
}
