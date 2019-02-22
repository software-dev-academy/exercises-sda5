package exercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashtableTests {

    Person p = new Person("Phil");
    Address b = new Address("Valhallavagen", 90);
    Hashtable table = null;

    @BeforeEach
    void initTest() {
        table = new Hashtable();
    }

    @Test
    void testPutAndGet() {
        table.put(p, b);
        Address addr = (Address) table.get(p);
        assertEquals(addr, b);
    }

    @Test
    void testPutTwiceAndGet() {
        table.put(p, b);
        Address b2 = new Address("Dalagatan", 10);
        table.put(p, b2);
        Address addr2 = (Address) table.get(p);
        assertEquals(addr2, b2);
    }
}