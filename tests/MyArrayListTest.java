//import java.util.Iterator;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MyArrayListTest {
//
//    private
//    MyArrayList<String> list = new MyArrayList<>();  // Arrange
//
//    @org.junit.jupiter.api.Test
//    void size() {
//        assertEquals(0, list.size());
//    }
//
//    @org.junit.jupiter.api.Test
//    void get() {
//        list.add("a");
//        list.add("b");
//
//        String actual = list.get(1);
//        assertEquals("b", actual);// Assert);
//    }
//
//    @org.junit.jupiter.api.Test
//    void ctor() {
//        assertTrue(list.isEmpty());// Assert);
//    }
//
//    @org.junit.jupiter.api.Test
//    void add_11() {
//        for (int i=0; i<11;i++)
//            list.add("A");                         // Act
//        assertEquals(11, list.size());
//    }
//
//    @org.junit.jupiter.api.Test
//    void add() {
//        list.add("A");                         // Act
//        assertFalse(list.isEmpty());// Assert
//        assertEquals(1, list.size());
//    }
//
//
//    @org.junit.jupiter.api.Test
//    void iterator() {
//        list.add("A");     list.add("B");
//        // Act
//        Iterator<String> list2 = list.iterator();
//        assertTrue(list2.hasNext());
//        assertEquals("A", list2.next());
//        assertTrue(list2.hasNext());
//        assertEquals("B", list2.next());
//        assertFalse(list2.hasNext());
//    }
//}