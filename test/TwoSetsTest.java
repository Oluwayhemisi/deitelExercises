import org.junit.jupiter.api.Test;
import tddClass.SumSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSetsTest {
    @Test
    public void testThatDistinctElementAreAdded(){
        SumSet set = new SumSet();
        int[] a = {3,1,7,9};
        int[] b = {6,1,9,4};
         int result = set.addDistinctElement(a,b);
        assertEquals(20, result);
    }
}
