package hackerrankTest;

import HackerRankSolutions.DivisibleSumPairs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleSumPairsTest {

    DivisibleSumPairs divisibleSumPairs;

    @BeforeEach
    void setUp() {
        divisibleSumPairs = new DivisibleSumPairs();
        List<Integer> arr = new ArrayList<>();
    }

    @Test
    void testDivisiblePair() {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(1);
        arr.add(2);
        int result = divisibleSumPairs.divisibleSumPair(6, 3, arr);
        assertEquals(5,result);
    }
}