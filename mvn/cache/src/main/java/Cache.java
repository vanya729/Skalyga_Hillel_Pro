
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *  * The `Cache' class represents a cache for storing objects and logging WARNING and INFO level events.
 *
 *
 */
public class Cache {
    private static final Logger LOGGER = Logger.getLogger(Cache.class.getName());
    private Map<String, Map<String, Object>> cacheMap;

    public Cache() {
        this.cacheMap = new HashMap<>();

        try {
            File warningLogFile = new File("mvn/cache/src/main/warning.log");
            FileHandler warningFileHandler = new FileHandler(warningLogFile.getAbsolutePath());
            warningFileHandler.setFormatter(new SimpleFormatter());
            warningFileHandler.setLevel(Level.WARNING);

            File infoLogFile = new File("mvn/cache/src/main/info.log");
            FileHandler infoFileHandler = new FileHandler(infoLogFile.getAbsolutePath());
            infoFileHandler.setFormatter(new SimpleFormatter());
            infoFileHandler.setLevel(Level.INFO);

            LOGGER.addHandler(warningFileHandler);
            LOGGER.addHandler(infoFileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds an object to the cache by the specified key.
     *
     * @param cache name
     * @param key the key
     * @param o the object to add to the cache
     * @return true if the object was successfully added to the cache
     */
    public boolean put(String cache, String key, Object o) {
        if (cache == null || key == null || o == null) {
            LOGGER.warning("Invalid arguments to put method");
            return false;
        }
        cacheMap.computeIfAbsent(cache, k -> new HashMap<>()).put(key, o);
        LOGGER.info("Object added to cache: cache=" + cache + ", key=" + key);
        return true;
    }


    /**
     * Gets an object from the cache by the specified key.
     *
     * @param cache name
     * @param key the key
     * @return an object from the cache or null if there is no object with such a key
     */
    public Object get(String cache, String key) {
        if (cache == null || key == null) {
            LOGGER.warning("Invalid arguments for get method");
            return null;
        }

        Map<String, Object> innerCache = cacheMap.get(cache);
        if (innerCache != null) {
            Object o = innerCache.get(key);
            if (o != null) {
                LOGGER.info("The object is obtained from the cache: cache=" + cache + ", key=" + key);
                return o;
            }
        }
        LOGGER.info("The object with the key " + key + " was not found in the cache" + cache +"not found");
        return null;
    }

    /**
     * Clears all caches.
     */
    public void clearAll(){
        cacheMap.clear();
        LOGGER.info("All caches clear");
    }

    /**
     * Clears the cache by the specified name.
     *
     * @param cache  name
     */
    public void clear(String cache){
        if (cache== null){
            LOGGER.warning("Invalid arguments to clear method");
            return;
        }
        Map<String,Object> newCache = cacheMap.remove(cache);
        if (newCache!= null){
            LOGGER.info("Cache " + cache + "cleared.");
        }
    }
    /**
     * Checks for the existence of a cache by the specified name.
     *
     * @param cache name
     * @return true if the cache exists
     */
    public boolean  isCacheExist(String cache){
        boolean cacheExist = cacheMap.containsKey(cache);
        if (cacheExist){
            LOGGER.info("Cache " + cache + " exists");
        }else {
            LOGGER.info("Cache" + cache + "does not exist");
        }
        return cacheExist;
    }

    /**
     * Gets the internal cache.
     *
     * @return a map containing all caches and their objects
     */
    public Map<String, Map<String, Object>> getCacheMap() {
        return cacheMap;
    }
}
