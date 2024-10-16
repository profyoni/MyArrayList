import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @org.junit.jupiter.api.Test
    void size() {
        SinglyLinkedList list = new SinglyLinkedList();  // Arrange
        assertEquals(0, list.size());
    }

    @org.junit.jupiter.api.Test
    void get() {
        SinglyLinkedList list = new SinglyLinkedList();  // Arrange
        list.add("a");
        list.add("b");

        String actual = list.get(1);
        assertEquals("b", actual);// Assert);
    }

    @org.junit.jupiter.api.Test
    void ctor() {
        SinglyLinkedList list = new SinglyLinkedList();  // Arrange
        assertTrue(list.isEmpty());// Assert);
    }

    @org.junit.jupiter.api.Test
    void add_11() {
        SinglyLinkedList list = new SinglyLinkedList();  // Arrange
        for (int i=0; i<11;i++)
            list.add("A");                         // Act
        assertEquals(11, list.size());
    }

    @org.junit.jupiter.api.Test
    void add() {
        SinglyLinkedList list = new SinglyLinkedList();  // Arrange
        list.add("A");                         // Act
        assertFalse(list.isEmpty());// Assert
        assertEquals(1, list.size());
    }

    @Test
    void contains() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add("A");
        assertTrue(list.contains("A"));
        assertFalse(list.contains("B"));
    }
    @Test
    void contains2() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add("A"); list.add("B");list.add("C");
        assertTrue(list.contains("A"));
        assertTrue(list.contains("B"));
        assertTrue(list.contains("C"));
        assertFalse(list.contains("D"));
    }

    @Test
    void containsNull() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(null);
        list.add("B");
        list.add("C");
        assertTrue(list.contains(null));
    }

    @Test
    void containsNull2() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(null);list.add("B");
        assertFalse(list.contains("A"));
    }

    @org.junit.jupiter.api.Test
    void iterator() {
        SinglyLinkedList list = new SinglyLinkedList();  // Arrange
        list.add("A");     list.add("B");
        // Act
        Iterator<String> list2 = list.iterator();
        assertTrue(list2.hasNext());
        assertEquals("A", list2.next());
        assertTrue(list2.hasNext());
        assertEquals("B", list2.next());
        assertFalse(list2.hasNext());
    }
}