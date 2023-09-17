import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Cache cache = new Cache();
        cache.put("1", "1", "1");
        cache.put("2", "2", "2");
        cache.put(null, null, null);
        cache.put("4", "4", "4");
        cache.put("5", "5", "5");
        cache.get("1", "1");
        cache.get(null, null);
        cache.get("2", "2");

        cache.isCacheExist("1");
        cache.isCacheExist("3");

        cache.clear("2");
        cache.clear(null);
        cache.clearAll();
    }
}
