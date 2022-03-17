package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {


    @Test
    public void onAirconditionTest(){

        //given
        AirCondition thermocool = new AirCondition();
        assertFalse(thermocool.getOn());
        // when
        thermocool.setOn(true);
        //assert
        assertTrue(thermocool.getOn());
        thermocool.increaseTemp();
        System.out.println(thermocool.getTemperature());
        assertEquals(17,thermocool.getTemperature());
    }
    @Test
    public void offAirconditionTest(){

        //given
        AirCondition thermocool = new AirCondition();
        thermocool.setOn(true);
        assertTrue(thermocool.getOn());
        //when
        thermocool.setOn(false);
        //assert
        assertFalse(thermocool.getOn());

    }
    @Test
    public void increaseTemperatureTest(){
        //given
        AirCondition thermocool = new AirCondition();
        // when
        thermocool.increaseTemp();

        thermocool.getTemperature();
        //assert
        assertEquals(17,thermocool.getTemperature());
    }
    @Test
    public void decreaseTemperatureTest(){
        //given
        AirCondition thermocool = new AirCondition();
        //when
        thermocool.increaseTemp();
        thermocool.increaseTemp();

        assertEquals(18,thermocool.getTemperature());

        thermocool.decreaseTemp();
        thermocool.decreaseTemp();
        thermocool.decreaseTemp();

        thermocool.getTemperature();
        //assert
        assertEquals( 16,thermocool.getTemperature());


    }
    @Test
    public void beyondTemperatureTest(){
        //given
        AirCondition thermocool = new AirCondition();
        //when
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.increaseTemp();
        thermocool.getTemperature();
        //assert
        assertEquals( 30,thermocool.getTemperature());

    }

    @Test
    public void belowTemperatureTest(){
        //given
        AirCondition thermocool = new AirCondition();

        //when
        thermocool.decreaseTemp();
        thermocool.getTemperature();
        //assert
        assertEquals( 16,thermocool.getTemperature());
    }


}

