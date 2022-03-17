package tddClass;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest<number> {
    @Test
    public void addTest() {
        Kata calculator = new Kata();
        int result = calculator.add(4, 3);

        assertEquals(7, result);

    }

    @Test
    public void subtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(7, 2);

        assertEquals(5, result);
    }

    @Test
    public void absoluteSubtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 7);
        assertEquals(5, result);
    }

    @Test
    public void calculateAreaTest() {
        Kata circle = new Kata();
        double result = circle.findAreaWith(7);
        assertEquals(154, result);
    }

    @Test
    public void bitFlipperTest() {
        Kata flipper = new Kata();


        int bit;
        int result = flipper.flip(bit = 0);
        assertEquals(1, result);

        result = flipper.flip(1);
        assertEquals(0, result);
    }


    @Test
    public void Parlindrome() {
        Kata fiveDigits = new Kata();
        boolean result= fiveDigits.compareParl(12345);
      //  assertEquals(false,result);
        result = fiveDigits.compareParl(11211);
        assertEquals(true,result );
    }
    @Test
    public void TestDrillerUTME(){
     Kata jamb = new Kata();
     int result = jamb.setPrice(4);
     assertEquals(8000,result);

         }


   @Test
   public void TestDrillerUTMEBelow10() {
       Kata jamb = new Kata();
       int result = jamb.setPrice(9);
       assertEquals(16200, result);
   }

@Test
    public void TestDrillerUTMEBelow30(){
    Kata jamb = new Kata();
    int result = jamb.setPrice(29);
    assertEquals(46400,result);
}
  @Test
    public void TestDrillerUTMEBelow50(){
      Kata jamb = new Kata();
      int result = jamb.setPrice(49);
      assertEquals(73500,result);
  }
@Test
    public void TestDrillerUTMEBelow100(){
    Kata jamb = new Kata();
    int result = jamb.setPrice(99);
    assertEquals(128700,result);
}
@Test
    public void TestDrillerUTMEBelow200(){
    Kata jamb = new Kata();
    int result = jamb.setPrice(199);
    assertEquals(238800,result);
}
@Test
    public void TestDrillerUTMEBelow500(){
    Kata jamb = new Kata();
    int result = jamb.setPrice(499);
assertEquals(548900,result);
}
 @Test
 public void TestDrillerUTMEabove500(){
     Kata jamb = new Kata();
     int result = jamb.setPrice(500);
     assertEquals(500000,result);
 }
@Test
    public void quotientTest() {
    //given
    Kata numbers = new Kata();
    //when
    int answer = numbers.quotientTest(8, 4);
    //assert
    assertEquals(2, answer);
}

    @Test
            public void evenTest(){
        int number = 2;
        while(number <= 100){
            System.out.print(number+ " ");
            number = number + 2;

    }

    }





















}

