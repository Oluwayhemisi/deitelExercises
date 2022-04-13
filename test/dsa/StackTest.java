package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;


    @BeforeEach
    public void setUp(){stack = new Stack();
    }

    @Test
    public void stackCanBeCreatedTest(){
        Stack stack = new Stack();
        assertNotNull(stack);
    }

    @Test
    public void stack_IsEmptyTest(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushOneElement_stackIsNotEmpty(){
        Stack stack = new Stack();
        stack.push(13);
        assertFalse(stack.isEmpty());
    }
    @Test
    public void pushX_popX_stackShouldBeEmpty(){
        stack.push(13);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushTwice_popOnce_stackShouldNotBeEmpty(){
        stack.push(13);
        stack.push(5);
        stack.pop();
        assertFalse(stack.isEmpty());

    }
    @Test
    public void pushX_popX_elementShouldBeXTest(){
        stack.push(34);
        stack.push(3);
        int element =stack.pop();
        assertEquals(3,element);
    }
    @Test
    public void pushXandY_popYandX_elementIsYthenX(){
        stack.push(50);
        stack.push(34);
        int element = stack.pop();
        assertEquals(34,element);
        element = stack.pop();
        assertEquals(50,element);
    }
    @Test
    public void pushXandY_andpeekReturnsYTest(){
        stack.push(32);
        stack.push(69);
        int element = stack.peek();
        assertEquals(69,element);
        element = stack.pop();
        assertEquals(69,element);
        element = stack.peek();
        assertEquals(32,element);

    }
}
