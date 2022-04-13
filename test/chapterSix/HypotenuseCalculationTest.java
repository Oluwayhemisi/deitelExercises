package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HypotenuseCalculationTest {
    HypotenuseCalculation number;

    @BeforeEach
    void setUp() {
        number = new HypotenuseCalculation();
    }
    @Test
    void notNullTest(){
        assertNotNull(number);
    }

    @Test
    void calculationsOfHypotenuseForFirstTriangle(){
        number.calculateHypotenuse(3.0,4.0);
        assertEquals(5.0,number.getHypotenuse());
    }
    @Test
    void calculationsOfHypotenuseForSecondTriangle(){
        number.calculateHypotenuse(5.0,12.0);
        assertEquals(13.0,number.getHypotenuse());
    }
    @Test
    void calculationsOfHypotenuseForThirdTriangle(){
        number.calculateHypotenuse(8.0,15.0);
        assertEquals(17.0,number.getHypotenuse());
    }
}