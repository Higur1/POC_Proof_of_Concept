package Cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CacheWithConcurrentMap {
    private static final CacheWithConcurrentMap INSTANCE = new CacheWithConcurrentMap();

    private final ConcurrentMap<String, String> data = new ConcurrentHashMap<>();

    private CacheWithConcurrentMap() {
    }

    public static CacheWithConcurrentMap getInstance() {
        return INSTANCE;
    }

    public String get(String property) {
        return data.get(property);
    }

    public void set(String property, String value) {
        data.put(property, value);
    }
}
