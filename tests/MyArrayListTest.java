import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @org.junit.jupiter.api.Test
    void size() {
        MyArrayList list = new MyArrayList();  // Arrange
        assertEquals(0, list.size());
    }

    @org.junit.jupiter.api.Test
    void get() {
        MyArrayList list = new MyArrayList();  // Arrange
        list.add("a");
        list.add("b");

        String actual = list.get(1);
        assertEquals("b", actual);// Assert);
    }

    @org.junit.jupiter.api.Test
    void ctor() {
        MyArrayList list = new MyArrayList();  // Arrange
        assertTrue(list.isEmpty());// Assert);
    }

    @org.junit.jupiter.api.Test
    void add_11() {
        MyArrayList list = new MyArrayList();  // Arrange
        for (int i=0; i<11;i++)
            list.add("A");                         // Act
        assertEquals(11, list.size());
    }

    @org.junit.jupiter.api.Test
    void add() {
        MyArrayList list = new MyArrayList();  // Arrange
        list.add("A");                         // Act
        assertFalse(list.isEmpty());// Assert
        assertEquals(1, list.size());
    }
}