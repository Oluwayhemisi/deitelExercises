package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.WorldPopulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class WorldPopulationTest {
    WorldPopulation census;

    @BeforeEach
    void setUp(){
        census = new WorldPopulation();
    }
    @Test
    void notNullTest(){
        assertNotNull(census);
    }
    @Test
    void firstYearTest(){
        census.setFirstYear(7.989654,0.1030,1);
        assertEquals(8.812588362,census.getPopulation());
    }
    @Test
    void secondYearTest(){
        census.setFirstYear(7.989654,0.1030,2);
        assertEquals(9.720284963286,census.getPopulation());

    }
}
