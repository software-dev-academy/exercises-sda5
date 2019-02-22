package exercises;

public class TestHashtable {
    public static void main(String[] args) {
        Person p = new Person("Phil");
        Person q = new Person("Karin");
        Address a = new Address("Sveavagen", 5);
        Address b = new Address("Valhallavagen", 90);

        Person q2 = new Person("Karin");

        // q == q2?  NO

        String s = "Karin";
        String s2 = "Kari";
        s2 = s2 + "n";
        System.out.println("equal using equals? " + s.equals(s2));

        System.out.println("q.equals(q2): " + q.equals(q2));


        int SIZE = 10;
        Object[] array = new Object[SIZE];
        array[0] = new Person("Dan");
        array[1] = new Person("Jim");

        array[1] = new Address("..", 4);
        Object pp = array[1];

        /* Important problem to solve:
        
           It is possible:

           Person p = new Person("Karin");
           Person q = new Person("John");

           p.hashCode() == q.hashCode();

           That means:

           table.put(p, address);
           table.put(q, address2);

           ...

           table.get(p)  -->   address2    !!! BUG !!!

        */

        Hashtable table = new Hashtable();
        
        System.out.println("Insert key " + p + " and value " + b);
        table.put(p, b);

        Address addr = (Address) table.get(p);
        System.out.println("Result of get: " + addr);

        Address b2 = new Address("Dalagatan", 10);
        System.out.println("Insert key " + p + " and value " + b2);
        table.put(p, b2);
        Address addr2 = (Address) table.get(p);
        System.out.println("Result of get: " + addr2);



        // Address c = table.get(new Person("Karin"));

    }
}