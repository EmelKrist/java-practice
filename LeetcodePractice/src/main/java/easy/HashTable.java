package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTable<K, V> {
    private int size = 100;
    private ArrayList<Entry<K, V>>[] buckets;

    public HashTable() {
        init();
    }

    public HashTable(int size) {
        this.size = size;
        init();
    }

    private void init() {
        this.buckets = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            this.buckets[i] = new ArrayList<>();
        }
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        ArrayList<Entry<K,V>> list = this.buckets[index];
        for (Entry<K, V> entry : list) {
            if (key.equals(entry.getKey())) {
                entry.setValue(value);
                return;
            }
        }
        list.add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = getIndex(key);
        ArrayList<Entry<K,V>> list = buckets[index];
        for (Entry<K, V> entry : list) {
            if (key.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    private int getIndex(K key) {
        return Math.abs(hashCode(key)) % buckets.length;
    }

    public int hashCode(K key) {
        String input = String.valueOf(key);
        int hash = 0;
        for (int i = 0; i < input.length(); i++) {
            hash = hash * 31 + input.charAt(i);
        }
        return hash;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "size=" + size +
                ", data=" + Arrays.toString(buckets) +
                '}';
    }

    private class Entry<K, V> {
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

        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}
