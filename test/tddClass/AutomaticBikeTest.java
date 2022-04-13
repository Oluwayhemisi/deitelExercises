package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    @Test
    public void onBikeTest() {
        //given
        AutomaticBike bajaj = new AutomaticBike();
        //when
        bajaj.setOn(true);
        //assert
        assertTrue(bajaj.isOn());

    }

    @Test
    public void offBikeTest() {
        //given
        AutomaticBike bajaj = new AutomaticBike();
        //when
        bajaj.setOn(false);
//        bajaj.isOn();
//        assert
        assertFalse(bajaj.isOn());

    }

    @Test
    public void accelerateBikeTest(){
    //given
    AutomaticBike bajaj = new AutomaticBike();
    //when
       /* bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();
        bajaj.accelerate();*/

        int velocity = 1;
        while (velocity <= 20){
            bajaj.accelerate();
            velocity = velocity + 1;
        }



        //assert
        assertEquals(20,bajaj.getVelocity());

    }
   @Test
    public void accelerateGearTwoTest(){
    //given
    AutomaticBike bajaj = new AutomaticBike();
    //when
      /*bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();
      bajaj.accelerate();

      bajaj.accelerate();*/

      int velocity = 1;
      while (velocity <= 30 )
          bajaj.accelerate();
      velocity = velocity + 2;

       //asert
       assertEquals(23,bajaj.getVelocity());
   }

   @Test
    public void accelerateGearThreeTest() {
       //given
       AutomaticBike bajaj = new AutomaticBike();
       //when
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();

       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();
       bajaj.accelerate();

       bajaj.accelerate();
       bajaj.accelerate();

       //assert
       assertEquals(37, bajaj.getVelocity());

   }

@Test
    public void accelerateGearFourTest(){
        //given
    AutomaticBike bajaj = new AutomaticBike();
    //when
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();

    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();


    bajaj.accelerate();



    //assert
    assertEquals(47, bajaj.getVelocity());


}
@Test
    public void deccelarateBikeTest(){
        //given
    AutomaticBike bajaj = new AutomaticBike();
        //when
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.deccelarate();

        //assert
    assertEquals(19,bajaj.getVelocity());

}
@Test
    public void decccelarateGearTwo(){
 //given
 AutomaticBike bajaj = new AutomaticBike();
 //when
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();

    bajaj.accelerate();
    bajaj.accelerate();

    bajaj.deccelarate();

    //assert
    assertEquals(23,bajaj.getVelocity());
}
@Test
    public void deccelarateGearThree(){
        //given
    AutomaticBike bajaj = new AutomaticBike();
    //when
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();

    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();

    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();

    bajaj.deccelarate();

    //assert
    assertEquals(37,bajaj.getVelocity());
}

@Test
    public void deccelerateGearFour(){
     //given
    AutomaticBike bajaj = new AutomaticBike();
    //when
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();

    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();
    bajaj.accelerate();


    bajaj.accelerate();
    bajaj.deccelarate();

    //assert
    assertEquals(43,bajaj.getVelocity());









}


















}



