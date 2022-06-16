package hugeIntegers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.HugeIntegers;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegersTest {
    HugeIntegers hugeIntegers = new HugeIntegers();
    @BeforeEach
    void setUp(){
        hugeIntegers = new HugeIntegers();
    }
    @Test
    void assertNotNullTest(){
        assertNotNull(hugeIntegers);
    }
    @Test
    void testThatYouCanParseADataType(){
        hugeIntegers.parse("12345876542345678498");
        int[] Array = hugeIntegers.getArrayItem();
        assertEquals(2,Array[1]);
        assertEquals(4,Array[3]);
        assertEquals(7,Array[6]);
        assertEquals(4,Array[9]);
        assertEquals(1,Array[0]);
        assertEquals(20, hugeIntegers.getSize());

    }
    @Test
    void testThatYouCanConvertToString(){
        hugeIntegers.parse("12345876542345678498");
        int[] Array = hugeIntegers.getArrayItem();
        assertEquals(3,Array[2]);
        assertEquals(8,Array[5]);
        assertEquals(8,Array[19]);
        assertEquals(7,Array[15]);
    }
    @Test
    void testThatHugeIntegersCanBeAdded(){
        HugeIntegers hugeIntegers1 = new HugeIntegers();
        HugeIntegers hugeIntegers2 = new HugeIntegers();
        hugeIntegers1.parse("456");
        hugeIntegers2.parse("342");
        String result = HugeIntegers.add(hugeIntegers1,hugeIntegers2);
        assertEquals("7980000000000000000000000000000000000000",result);
    }
    @Test
    void testThatTwoIntegersCanBeEqual(){
        HugeIntegers hugeIntegers1 = new HugeIntegers();
        hugeIntegers1.parse("3333000000000000000000000000000000000000");
        HugeIntegers hugeIntegers2 = new HugeIntegers();
        hugeIntegers2.parse("333300000000000000000000000000000000000");
        assertTrue(hugeIntegers1.isEqualTo(hugeIntegers2));
    }

}
