package exercise;

import java.util.Map;
import java.util.HashMap;



public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> kVVault = new HashMap<>();

    public InMemoryKV(Map<String, String> kVVault) {
        this.kVVault = new HashMap<>(kVVault);
    }

    @Override
    public void set(String key, String value) {
        kVVault.put(key, value);
    }

    @Override
    public String get(String key, String defaultValue) {
        if (kVVault.containsKey(key)) {
            return kVVault.get(key);
        }
        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(this.kVVault);
    }

    @Override
    public void unset(String key) {
        kVVault.remove(key);

    }
}