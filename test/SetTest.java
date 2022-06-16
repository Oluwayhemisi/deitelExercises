import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.Set;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Set set;
    @BeforeEach
    void setUp(){
        set = new Set();
    }
    @Test
    void notNullTest(){
        assertNotNull(set);
    }
    @Test
    void testToAddItem(){
        set.addItem("book");
        assertEquals(1,set.size());
    }
    @Test
    void testThatItemCannotBeRepeated(){
        set.addItem("book");
        set.addItem("book");
        assertTrue(set.contains("book"));
//        assertEquals(1,set.size());
    }
    @Test
    void testToRemoveItem(){
        set.addItem("book");
        set.addItem("pen");
        set.addItem("ruler");
        set.addItem("peanut");
        set.removeItem("pen");
        System.out.println(Arrays.toString(set.getArrayList().getArray()));
        assertEquals(3, set.size());
        assertFalse(set.contains("pen"));
    }
    @Test
    void testThatMultipleItemCanBeAdded(){
        set.addItem("book");
        set.addItem("pen");
        set.addItem("ruler");
        set.addItem("peanut");
        assertEquals(4,set.size());
    }
    @Test
    void testThatRemoveMultipleItem(){
        set.addItem("book");
        set.addItem("pen");
        set.addItem("ruler");
        set.addItem("peanut");
        set.removeItem("book");
        set.removeItem("pen");
        assertEquals(2,set.size());
    }
}
