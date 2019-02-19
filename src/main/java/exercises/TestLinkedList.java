package exercises;

public class TestLinkedList {
    public static void main(String[] args) {
        var list = new LinkedList();

        list.add(5);
        System.out.println("Size of list: " + list.size());
        list.add(19);
        System.out.println("Size of list: " + list.size());

        // expected: 5
        System.out.println("element at index 0: " + list.get(0));

        try {
            list.get(2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("OK");
        }

        try {
            list.get(-1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("OK");
        }

        System.out.println("list: " + list.toStringSlow());
        System.out.println("faster toString(): " + list);
    }
}
