import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.Sort;

import static org.junit.jupiter.api.Assertions.*;


public class SortTest {
    Sort sort;
    @BeforeEach
    void setUp(){
        sort = new Sort();
    }

    @Test
    void notNullTest(){
        assertNotNull(sort);
    }
    @Test
    void testThatYouCanSort(){
        int[] array = {21, 3, 4, -1, 33, 11,5};
        int[] result = sort.sortArray(array);
        int[] expected = {-1, 3,4,5,11,21,33};
        assertArrayEquals(expected,result);

        }
        @Test
        void testThatYouCanSortByLargestNumber(){
        int [] array =  {21, 3, 4, -1, 33, 11,5};
        int [] result = sort.selectSortArray(array);
        int[] expected = {-1, 3,4,5,11,21,33};
        assertArrayEquals(expected,result);
        }

    }

