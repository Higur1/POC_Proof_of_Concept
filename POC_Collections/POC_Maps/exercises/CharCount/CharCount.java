package CharCount;

import java.util.Map;
import java.util.TreeMap;

public class CharCount {
    public static void main(String[] args) {
        System.out.println(count("Glass"));
    }
    private static Map<Character, Integer> count(String str){
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new TreeMap<>();
        for(char c: chars){
            //int count = map.get(c);// nullPointerException - if map.get returns null
            //Integer count = map.get(c); //way to storage null
            int count = map.getOrDefault(c, 0);//protected count to null
            map.put(c, count+1);
        }

        return map;
    }
}
