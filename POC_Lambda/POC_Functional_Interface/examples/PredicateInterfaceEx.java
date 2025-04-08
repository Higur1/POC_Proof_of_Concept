import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceEx {
    public static void main(String[] args) {
        var list = List.of("A","B","C","D","E","F", "AB", "ACV");
        System.out.println(filter(list, s -> s.contains("A")));
    }
    private static List<String> filter(List<String> list, Predicate<String> predicate){
        List<String> newList = new ArrayList<>();
        for (String e: list){
            if(predicate.test(e)){
                newList.add(e);
            }
        }
        return newList;
    }
}
