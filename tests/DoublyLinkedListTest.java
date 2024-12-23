import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    private DoublyLinkedList<String> list = new DoublyLinkedList<>();  // Arrange

    @Test
    void size() {
        assertEquals(0, list.size());
    }

    @Test
    void get() {
        String s;
        list.add("a");
        list.add("b");

        String actual = list.get(1);
        assertEquals("b", actual);// Assert);
    }

    @Test
    void ctor() {
        assertTrue(list.isEmpty());// Assert);
    }

    @Test
    void add_11() {
        for (int i=0; i<11;i++)
            list.add("A");                         // Act
        assertEquals(11, list.size());
    }

    @Test
    void add() {
        list.add("A");                         // Act
        assertFalse(list.isEmpty());// Assert
        assertEquals(1, list.size());
    }
    @Test
    void remove() {
        list.add("A");list.add("B");
        list.remove(1);

        assertTrue(list.contains("A"));
        assertFalse(list.contains("B"));
        assertEquals(1, list.size());
    }

    @Test
    void contains() {
        list.add("A");
        assertTrue(list.contains("A"));
        assertFalse(list.contains("B"));
    }
    @Test
    void contains2() {
        list.add("A"); list.add("B");list.add("C");
        assertTrue(list.contains("A"));
        assertTrue(list.contains("B"));
        assertTrue(list.contains("C"));
        assertFalse(list.contains("D"));
    }

    @Test
    void containsNull() {
        list.add(null);
        list.add("B");
        list.add("C");
        assertTrue(list.contains(null));
    }

    @Test
    void containsNull2() {
        list.add(null);list.add("B");
        assertFalse(list.contains("A"));
    }

    @Test
    void iterator() {
        list.add("A");     list.add("B");
        // Act
        Iterator<String> list2 = list.iterator();
        assertTrue(list2.hasNext());
        assertEquals("A", list2.next());
        assertTrue(list2.hasNext());
        assertEquals("B", list2.next());
        assertFalse(list2.hasNext());
    }
    @Test
    void iterator2() {
        list.add("A");     list.add("B");
        // Act
        String sum ="";
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            sum += it.next();
        }
        assertEquals("AB", sum);
    }
}