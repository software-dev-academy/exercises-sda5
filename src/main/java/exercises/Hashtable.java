package exercises;

class Entry {
    Object key;
    Object value;
    Entry next;
    Entry(Object key, Object value, Entry next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}

public class Hashtable {

    private int SIZE = 256;
    private Entry[] array = new Entry[SIZE];

    /**
     * Inserts a mapping from a given key to a
     * given value into 'this' hash table.
     */
    public void put(Object key, Object value) {
        int hashCode = key.hashCode();

        int index = hashCode % SIZE;
        // now, index is guaranteed to be between 0 and SIZE-1 !!

        // so, now we put the key-value pair at the index "index"

        Entry first = array[index];

        // 1. create an Entry object
        Entry e = new Entry(key, value, null);

        if (first == null) {
            // 2. insert into array
            array[index] = e;
        } else {
            // Task 1: Find the correct Entry object
            Entry current = first;
            while (current.next != null) {
                if (current.key.equals(key)) break;
                current = current.next;
            }
            // here, we have found the Entry object that needs
            // to be changed

            // Task 2: update the correct Entry object
            if (current.key.equals(key)) {
                current.value = value;
            } else {
                // here, current.next == null!
                // this means we are at the last Entry
                current.next = e;
            }
        }
    }

    public Object get(Object key) {
        int hashCode = key.hashCode();
        int index = hashCode % SIZE;

        Entry current = array[index];
        if (current == null) {
            throw new ElementNotFoundException();
        }

        while (!current.key.equals(key) && current.next != null) {
            current = current.next;
        }

        // 2 cases:
        // case 1: key is in the map
        // case 2: key is not in the map
        if (current.key.equals(key)) {
            return current.value;
        } else {
            throw new ElementNotFoundException();
        }

        // Object value = array[hashCode];
        // return value;
    }
}