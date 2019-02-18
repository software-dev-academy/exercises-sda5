package exercises;

public class TestLinkedList {
    public static void main(String[] args) {
        var list = new LinkedList();

        list.add(5);
        System.out.println("Size of list: " + list.size());
        list.add(19);
        System.out.println("Size of list: " + list.size());
    }
}