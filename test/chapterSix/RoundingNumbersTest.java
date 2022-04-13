package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundingNumbersTest {
    RoundingNumbers number;

    @BeforeEach
    void setUp() {
        number =new RoundingNumbers();


    }
    @Test
    void notNull(){
        assertNotNull(number);
    }
    @Test
    void nearestInteger(){
        double result  = number.setNearestNumber(40.5);
        assertEquals(40,number.getNum());
        assertEquals(40.5,number.getInitialNumber());
    }
//    Exercise6.10
    @Test
    void nearestNUmber(){
        double result = number.setNearestInteger(5.2);
        assertEquals(5,number.getNum());
    }
    @Test
    void numberCanBeRoundToTenths(){

 int result =  number.roundToTenth(22.5);
        System.out.println(result);
    assertEquals(22,number.roundToTenth(22.5));
    }

}