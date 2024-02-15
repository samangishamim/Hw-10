import java.util.LinkedList;

public class MyHashMap<K, V> {
    private static final int SIZE = 16;
    private LinkedList<Entry<K, V>>[] table;

    public MyHashMap() {
        table = new LinkedList[SIZE];
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode()) % SIZE;
        if (table[hash] == null) {
            table[hash] = new LinkedList<>();
        }

        for (Entry<K, V> entry : table[hash]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        table[hash].add(new Entry<>(key, value));
    }

    public boolean containsKey(K key) {
        int hash = Math.abs(key.hashCode()) % SIZE;
        if (table[hash] != null) {
            for (Entry<K, V> entry : table[hash]) {
                if (entry.getKey().equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isEmpty() {
        for (LinkedList<Entry<K, V>> list : table) {
            if (list != null && !list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode()) % SIZE;
        if (table[hash] != null) {
            for (Entry<K, V> entry : table[hash]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public void replace(K key, V value) {
        int hash = Math.abs(key.hashCode()) % SIZE;
        if (table[hash] != null) {
            for (Entry<K, V> entry : table[hash]) {
                if (entry.getKey().equals(key)) {
                    entry.setValue(value);
                    return;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            if (table[i] != null) {
                for (Entry<K, V> entry : table[i]) {
                    sb.append(entry.getKey()).append(" -> ").append(entry.getValue()).append(", ");
                }
            }
        }
        return sb.toString();
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
