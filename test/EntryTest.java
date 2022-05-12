import chapterEight.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.testng.AssertJUnit.assertEquals;

public class EntryTest {
    private Entry entry;
    private LocalDateTime theDate;
    @BeforeEach
    void setUp() {
        entry = new Entry("My life","I love my life");

    }


    @Test
   void getTitle(){
        assertEquals("My life!",entry.getTitle());
    }
    @Test

    void getBody(){
        assertEquals("I love my life",entry.getBody());

    }
    @Test
    void timeTest(){
        assertEquals(theDate,entry.getTheDate());
    }
}
