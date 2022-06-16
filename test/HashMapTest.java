import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {
    HashMap hashmap;
    @BeforeEach
    void setUp(){
        hashmap = new HashMap();
    }
    @Test
    void notNull(){
        assertNotNull(hashmap);
    }
    @Test
    void putTest(){
        hashmap.put("boo","bae");
        assertEquals(1,hashmap.getSize());

    }
    @Test
    void checkDuplicateKeys(){
        hashmap.put("boo","bae");
        assertTrue(hashmap.containKeys("boo"));
    }
    @Test
    void checkDuplicateValues(){
        hashmap.put("boo","bae");
        assertTrue(hashmap.containValues("bae"));
    }
//    @Test
//    void replace

}
