package ChapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class EntriesTest {
    private Entries entry;
    private String theDate;


    @BeforeEach
    void setUp() {
        entry = new Entries("My Life", "My name is Yemisi.");

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a");
        theDate = dateTimeFormatter.format(localDateTime);
    }

    @Test
    void getTitle(){
        assertEquals("My Life",entry.getTitle());
    }
    @Test
    void getBody(){
        assertEquals("My name is Yemisi.",entry.getBody());
    }
    @Test
    void getTheDate(){
        assertEquals(theDate, entry.getTheDate());

    }


}