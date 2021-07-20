public interface ICache {
    boolean putCache(String cacheName, String key, Object o);
    Object getCache(String cacheName, String key);
    void clear(String cacheName);
    void clearAll();
}
