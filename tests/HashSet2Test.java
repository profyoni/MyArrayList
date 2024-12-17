import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashSet2Test {

    private HashSet2<String> set = new HashSet2<>();
    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void contains() {
    }

    @Test
    void add() {
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("Dfdkhgfpour983wydosjfhbpioseuqty9esdgiudfsatpuoewytuopdsht79-ewygfpkdjsghf974wtoifudshgfpoiuwytfiopudsgt9ewytuodshgi");

        assertTrue(set.contains("A"));
    }
}