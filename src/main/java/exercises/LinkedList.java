package exercises;

class Node {
    int elem;
    Node next;
    public Node(int elem, Node next) {
        this.elem = elem;
        this.next = next;
    }
}

class LinkedList {
    // internal storage
    private Node first = null;
    private int size = 0;

    /**
     * Adds the integer `elem` to the end of `this` list.
     */
    public void add(int elem) {
        size++;
        if (first == null) {
            // 1. case: list is empty
            Node firstNode = new Node(elem, null);
            first = firstNode;
        } else {
            // 2. case : list is non-empty
            // this means: first != null

            // find the last node
            Node current = first;
            while (current.next != null) {
                // we are *not* at the last node!
                current = current.next;
            }
            // here, we know: current.next == null
            // that's amazing!
            // current is the last box!!!!
            Node newNode = new Node(elem, null);
            current.next = newNode;
        }
    }

    public int size() {
        return size;
    }

    /**
     * Complexity: O(N)
     */
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return first.elem;
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        // here, we would like "current" to refer to the
        // node at the given "index"
        return current.elem;
    }

    /**
     * Returns a nice string with all elements of the list, e.g.,
     * "[2,6]"
     *
     * Complexity: O(N^2)
     */
    public String toStringSlow() {
        String s = "[";
        for (int i = 0; i < size - 1; i++) {
            s = s + get(i) + ",";
        }
        s = s + get(size - 1) + "]";
        return s;
    }

    /**
     * Goal: O(N) complexity
     */
    public String toString() {
        String s = "[";
        Node current = first;
        // want to use while
        while (current.next != null) {
            s = s + current.elem + ",";
            current = current.next;
        }
        // here, current.next == null
        s = s + current.elem + "]";
        return s;
    }
}
