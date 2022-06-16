import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.Queue;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue queue;
    @BeforeEach
    void setUp(){
        queue = new Queue();
    }
    @Test
    void notNullTest(){
        assertNotNull(queue);
    }
    @Test
    void isEmptyTest(){
        queue.isEmpty();
        assertTrue(queue.isEmpty());
    }
    @Test
    void pushElements(){
        queue.enQueue(13);
        assertFalse(queue.isEmpty());
    }
    @Test
    void popElements(){
        queue.enQueue(2);
        queue.enQueue(5);
        queue.enQueue(3);
        queue.enQueue(6);
        queue.enQueue(12);
        queue.enQueue(8);

        queue.deQueue();
        queue.deQueue();
        int result = queue.deQueue();
        System.out.println(Arrays.toString(queue.array()));
        assertEquals(3,result);
        result = queue.peek();
        assertEquals(6,result);


    }
    @Test
    void push_pop_peek(){
        queue.enQueue(2);
        queue.enQueue(5);
        queue.enQueue(8);
        int result = queue.peek();
        System.out.println(Arrays.toString(queue.array()));
        assertEquals(2,result);
        result = queue.deQueue();
        assertEquals(2,result);
    }
}
