import java.util.*;

public class IteratingMaps {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new LinkedHashMap<>();
        scoreMap.put("Player A", 300);
        scoreMap.put("Player B", 400);
        scoreMap.put("Player C", 200);
        scoreMap.put("Player D", 600);

        Set<String> keys = scoreMap.keySet();

        for(String key: keys){
            System.out.println(key);
        }

        Collection<Integer> values = scoreMap.values();

        for(Integer value: values){
            System.out.println(value);
        }

        //Set<Map.Entry<String, Integer>> entries = scoreMap.entrySet();
        var entries = scoreMap.entrySet(); //another way

        /* generic way
        for(Map.Entry<String, Integer> entry: entries){

        }*/
        //another way
        for(var entry: entries){
            System.out.format("%s ===> %d\n ", entry.getKey(), entry.getValue());
        }
    }
}
