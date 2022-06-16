import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.ArrayList;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArrayListTest {

private ArrayList arrayList;
    @BeforeEach
    void setUp() {
        arrayList = new ArrayList();
    }
    @Test
    void notNull(){
        assertNotNull(arrayList);
    }
    @Test
    void arrayListCanAdd(){
        arrayList.add("shirt");
        arrayList.add("shoe");
        arrayList.add("cap");
        arrayList.add("jacket");
        arrayList.add("pant");
        arrayList.add("skirt");
        arrayList.add("socks");
        assertEquals(7,arrayList.size());

    }
    @Test
    void arrayListCanViewByIndex(){
        arrayList.add("shirt");
        arrayList.add("shoe");
        arrayList.add("cap");
        assertEquals("shoe",arrayList.get(1));
    }
    @Test
    void arrayListCanRemoveByItem(){
        arrayList.add("shirt");
        arrayList.add("shoe");
        arrayList.add("socks");
        arrayList.add("belt");
        arrayList.remove("shoe");
        System.out.println(Arrays.toString(arrayList.getArray()));
        assertEquals(3,arrayList.size());
    }
    @Test
    void arrayListCanRemoveByIndex(){
        arrayList.add("shirt");
        arrayList.add("shoe");
        arrayList.add("bad");
        arrayList.add("earrings");
        arrayList.add("spoon");
        arrayList.remove(2);
        System.out.println(Arrays.toString(arrayList.getArray()));
        assertEquals(4,arrayList.size());
        assertEquals("earrings", arrayList.get(2));
        assertEquals("spoon", arrayList.get(3));

    }
    @Test
    void arrayListCanExpandByTheLength(){
        arrayList.add("shirt");
        arrayList.add("shoe");
        arrayList.add("cap");
        arrayList.add("jacket");
        arrayList.add("pant");
        arrayList.add("skirt");
        arrayList.add("socks");
        arrayList.add("scarf");
        arrayList.add("jewelries");
        assertEquals(9,arrayList.size());
    }
    @Test
    void arrayListCanAddByIndex(){
        arrayList.add(0,"rice");
        arrayList.add(1,"beans");
        arrayList.add(2,"fish");
        arrayList.add(3,"chicken");
        arrayList.add(4,"plantain");
        assertEquals(5,arrayList.size());

    }
//    @Test
//    void testThatItemCanBeReplaced(){
//        arrayList.add(0,"rice");
//        arrayList.add(1,"beans");
//        arrayList.add(2,"fish");
//        arrayList.add(3,"chicken");
//        arrayList.add(4,"plantain");
//        boolean = arrayList.set();
//    }


}
