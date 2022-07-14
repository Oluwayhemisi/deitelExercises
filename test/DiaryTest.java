import Diarypackage.model.User;
import chapterEight.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.Diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a");
    private final String date = formatter.format(LocalDateTime.now());
    Diary diary;
    @BeforeEach
    void setUp() {
        diary = new Diary("0000","YEMISI");
    }
    @Test
    void notNull(){
        assertNotNull(diary);
    }

    @Test
    void diaryHasEntryTest(){
        assertEquals(0,diary.getNumberOfEntries());
    }
    @Test
    void createDiaryTest(){
       Entry entry1 = diary.createEntry("MY LIFE","I love my life");

        Entry entry2 = diary.createEntry("School","I love  Semicolon!");
        assertEquals("MY LIFE",entry1.getTitle());
        assertEquals("I love  Semicolon!",entry2.getBody());
    }
    @Test
    void addEntryTest(){
        Entry entry1 = diary.createEntry("MY LIFE","I love my life");
        Entry entry2 = diary.createEntry("SCHOOL","I love Semicolon!");
        diary.addEntry(entry1);
        diary.addEntry(entry2);


        assertEquals(2,diary.getNumberOfEntries());
    }
    @Test
    void findEntryTest(){
        Entry entry1 = diary.createEntry("MY LIFE","I love my life");
        Entry entry2 = diary.createEntry("SCHOOL","I love Semicolon!");

        diary.addEntry(entry1);
        diary.addEntry(entry2);
        diary.findEntry(2);
        String getDiary = diary.findEntry(2);
        assertEquals(2, diary.getNumberOfEntries());
        assertEquals(date+" | SCHOOL | I love Semicolon!",getDiary);
                assertEquals("SCHOOL", entry2.getTitle());

    }

    @Test
    void deleteEntryTest(){
        Entry entry1 = diary.createEntry("MY LIFE","I love my life");
        Entry entry2 = diary.createEntry("School","I love my Semicolon!");
        diary.deleteEntry(2);
        assertEquals("I love my Semicolon!",entry2.getBody());

    }
    @Test
    void unLockTest(){
        diary.unLockDiary("1234");
        assertFalse(diary.isLock());
    }

   @Test
    void changePasswordTest(){
       diary.changePassword("0000","1234");
       assertTrue(diary.validatePassword("1234"));
       Entry entry = diary.createEntry("MY MY","I love my my");
       diary.addEntry(entry);
       assertEquals(1, diary.getNumberOfEntries());
   }
   @Test
    void viewDiaryTest(){
        Entry entry1 = diary.createEntry("Hello","I Love you");
        Entry entry2 = diary.createEntry("Food","I Love Food");
        Entry entry3 = diary.createEntry("Love","Love is beautiful");
//        diary.viewEntry(2);
        assertEquals("Love",entry3.getTitle());
   }
   @Test
    void testToConfirmThatDiaryIsocked(){
        diary.lockDiary();
        assertTrue(diary.isLock());
   }
   @Test
    void testThatMultipleUsersCanRegister(){
       User user1 = new User("Sharon","1111");
       User user2 = new User("Simi","0000");
       ArrayList <User> users = new ArrayList<>();
       users.add(user1);
       users.add(user2);
       assertEquals(2, users.size());







   }

}
