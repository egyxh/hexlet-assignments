package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import exercise.InMemoryKV;
import exercise.KeyValueStorage;

public class App{
    public static void swapKeyValue(KeyValueStorage storage) {

        Map<String, String> currentData = new HashMap<>(storage.toMap());
        Map<String, String> swappedData = new HashMap<>();

        currentData.forEach((key, value) -> swappedData.put(value, key));
        currentData.keySet().forEach(storage::unset);
        swappedData.forEach(storage::set);

    }
}
