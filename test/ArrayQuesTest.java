import ArraySolutions.ArrayQues;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ArrayQuesTest {
   private ArrayQues arrayQues;


   @BeforeEach
    public void setUp() {
      arrayQues = new ArrayQues();

   }
   @Test
   public void notNull(){
      assertNotNull(arrayQues);
   }
   @Test
   void moveToZero(){
      int [] array = {0,0,0,2,0,3,0,1,5,0,4,0,0};
      int[] result = arrayQues.moveZero(array);
      int[] expected = {2,3,1,5,4,0,0,0,0,0,0,0,0};

      System.out.println(Arrays.toString(arrayQues.getArray()));
      assertArrayEquals(expected,result);
   }


}