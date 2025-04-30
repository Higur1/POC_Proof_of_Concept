package Cache;

public class CacheUse {
    public static void main(String[] args) {
        Cache cache = Cache.getInstance();

        cache.set("P1","V1");
        cache.set("P2","V2");
        cache.set("P3","V3");

        String p1 = cache.get("P1");
        String p2 = cache.get("P2");
        String p3 = cache.get("P3");
    }
}
