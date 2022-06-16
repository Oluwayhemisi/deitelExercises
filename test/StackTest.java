import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.Stack;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack;
    @BeforeEach
    void setUp(){

        stack = new Stack();
    }
    @Test
    void notNullTest(){
        assertNotNull(stack);
    }
    @Test
    void isEmptyTest(){
        stack.isEmpty();
        assertTrue(stack.isEmpty());
    }
    @Test
    void pushOneElement_stackIsNotEmpty(){
//        Stack stack = new Stack();
        stack.push(45);
        assertFalse(stack.isEmpty());
    }
    @Test
    void pushXPopX_StackShouldBeEmpty(){
        stack.push(30);
        stack.pop();
        System.out.println(Arrays.toString(stack.array()));
        assertTrue(stack.isEmpty());

    }
    @Test
    void pushTwice_popOnce(){
        stack.push(12);
        stack.push(5);
        stack.push(10);
        stack.push(8);
        stack.push(2);
        stack.push(7);
        stack.push(3);
        stack.pop();
        stack.pop();
        int result = stack.pop();

        System.out.println(Arrays.toString(stack.array()));
        assertEquals(2,result);
        assertFalse(stack.isEmpty());

    }
    @Test
    void pushX_popX_peekX(){
        stack.push(12);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(8);
        stack.push(9);
        stack.push(7);
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.pop();
        int result = stack.peek();
        System.out.println(Arrays.toString(stack.array()));
        assertEquals(8,result);


    }

}
