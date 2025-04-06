import java.util.LinkedList;
import java.util.List;

public class ListEssentials {
    public static void main(String[] args) {
        //var l1 = new ArrayList<Integer>();
        //List<Integer> l1 = new ArrayList<>(); //not possible primitive data
        List<Integer> l1 = new LinkedList<>();
        l1.add(3); // add element in list
        l1.add(4);
        l1.add(1);

        for(Integer i: l1){
            System.out.println(i);
        }
        //access element int list
        System.out.println(l1.get(1));

        //remove element in list
        l1.remove(1);
    }
}
