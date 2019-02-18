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
}