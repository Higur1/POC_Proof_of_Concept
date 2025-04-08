package StringLengthMapper;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private final Map<String, Integer> map = new HashMap<>();

    public int get(String s) {
        return map.computeIfAbsent(s, v -> {
            System.out.println("Computing value for "+ s);
            return v.length();
        });
    }
}
