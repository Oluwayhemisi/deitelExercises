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
        boolean result = fiveDigits.compareParl(12345);
        //  assertEquals(false,result);
        result = fiveDigits.compareParl(11211);
        assertEquals(true, result);
    }

    @Test
    public void TestDrillerUTME() {
        Kata jamb = new Kata();
        int result = jamb.setPrice(4);
        assertEquals(8000, result);

    }


    @Test
    public void TestDrillerUTMEBelow10() {
        Kata jamb = new Kata();
        int result = jamb.setPrice(9);
        assertEquals(16200, result);
    }

    @Test
    public void TestDrillerUTMEBelow30() {
        Kata jamb = new Kata();
        int result = jamb.setPrice(29);
        assertEquals(46400, result);
    }

    @Test
    public void TestDrillerUTMEBelow50() {
        Kata jamb = new Kata();
        int result = jamb.setPrice(49);
        assertEquals(73500, result);
    }

    @Test
    public void TestDrillerUTMEBelow100() {
        Kata jamb = new Kata();
        int result = jamb.setPrice(99);
        assertEquals(128700, result);
    }

    @Test
    public void TestDrillerUTMEBelow200() {
        Kata jamb = new Kata();
        int result = jamb.setPrice(199);
        assertEquals(238800, result);
    }

    @Test
    public void TestDrillerUTMEBelow500() {
        Kata jamb = new Kata();
        int result = jamb.setPrice(499);
        assertEquals(548900, result);
    }

    @Test
    public void TestDrillerUTMEabove500() {
        Kata jamb = new Kata();
        int result = jamb.setPrice(500);
        assertEquals(500000, result);
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
    public void evenTest() {
        int number = 2;
        while (number <= 100) {
            System.out.print(number + " ");
            number = number + 2;

        }

    }

    @Test
    public void evenNumber() {
        Kata num = new Kata();
        boolean result = num.isEven(5);
        assertFalse(result);


    }


    @Test

    public void highestNumTest() {
        Kata num = new Kata();
        int result = num.greaterThan(5, 78, 54, 9, 76);
        assertEquals(78, result);

    /*int counter =0;
    int number;
    int largest = 0;

    while (counter < 10);*/

    }

    @Test

    public void divisibilityTest() {
        Kata integer = new Kata();
        int result = integer.divisibleNumber(4);
       assertEquals(3,result);
    }

    @Test
    public void primeNumbers(){
        Kata prime = new Kata();
        boolean result = prime.getNumbers(17);
        assertTrue(result);
    }

    @Test
    void testCanReturnNumberOfFactors(){
        Kata noOfFactors = new Kata();
        int numberOfFactors = noOfFactors.returnNumberOfFactors(20);
        assertEquals(6, numberOfFactors);
    }
    @Test
    public void maximumTest(){
        Kata calculate = new Kata();
        int [] result = {61,9,7,6,5,3,8,2,3,4};
        assertEquals(61,calculate.testMax(result));
    }
    @Test
    public void minimumTest(){
        Kata calculate = new Kata();
        int [] result = {61,9,7,6,5,3,8,2,3,4};
        assertEquals(2,calculate.findMinimum(result));
    }
    @Test
    public void average(){
        Kata calculate = new Kata();
        int [] result = {61,9,7,6,5,3,8,2,3,4};
        assertEquals(10,calculate.findAverage(result));
    }
    @Test
    public void testToWin(){
        Kata calculate = new Kata();
        String result =calculate.win(4,3);
        assertEquals("you win",result);
    }

    @Test
    public void testToLose(){
        Kata calculate = new Kata();
        String result = calculate.lose(6,6);
        assertEquals("you lose",result);
    }
}


















