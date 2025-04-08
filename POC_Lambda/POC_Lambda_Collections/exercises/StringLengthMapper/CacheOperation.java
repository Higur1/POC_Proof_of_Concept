package StringLengthMapper;

public class CacheOperation {
    public static void main(String[] args) {
        Cache cache = new Cache();
        System.out.println(cache.get("house"));
        System.out.println(cache.get("house"));
        System.out.println(cache.get("house"));
        System.out.println(cache.get("house"));
        System.out.println(cache.get("room"));
        System.out.println(cache.get("room"));

    }
}
