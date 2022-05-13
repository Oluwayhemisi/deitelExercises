package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.BodyMaxIndex;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BodyMaxIndexTest {
    BodyMaxIndex calculator;

    @BeforeEach
    void setUp(){
        calculator = new BodyMaxIndex();
    }

    @Test
    void notNullTest(){
        assertNotNull(calculator);
    }
    @Test
    void underWeightTest(){
        calculator.setUnderWeight(15);
        assertEquals("underWeight",calculator.getWeight());

    }
    @Test
    void testHealthy(){
        calculator.setHealthyTest(20);
        assertEquals("Healthy",calculator.getWeight());
    }

    @Test
    void testOverweight(){
        calculator.setOverWeightTest(28);
        assertEquals("OverWeight",calculator.getWeight());
    }

    @Test
    void testObessed(){
        calculator.setObessedTest(35);
        assertEquals("Obessed",calculator.getWeight());
    }

}
