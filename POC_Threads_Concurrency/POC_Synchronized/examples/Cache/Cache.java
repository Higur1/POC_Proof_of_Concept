package Cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Cache {
    private static final Cache INSTANCE = new Cache();

    private final Map<String, String> data = new HashMap<>();

    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private Cache() {
    }

    public static Cache getInstance() {
        return INSTANCE;
    }

    public String get(String property) {
        lock.readLock().lock();  //allows multiple threads to access the get information while writeLock is not requested
        try {
            return data.get(property);
        } finally {
            lock.readLock().unlock();
        }

    }

    public void set(String property, String value) {
        lock.writeLock().lock(); //writeLock blocks any other thread access to the set and get
        try {
            data.put(property, value);
        } finally {
            lock.writeLock().unlock();
        }

    }
}
