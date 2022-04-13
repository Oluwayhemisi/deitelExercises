package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorAndCeilTest {
    FloorAndCeil number;

    @BeforeEach
    void setUp() {
        number = new FloorAndCeil();
    }
    @Test
    void notNull(){
        assertNotNull(number);
    }

    @Test
    void myFloorTest(){
        number.myFloor(2.5);
        assertEquals(2,number.getValue());

    }
    @Test
    void myCeilTest(){
        number.myCeil(2.5);
        assertEquals(3,number.getValue());
    }
}