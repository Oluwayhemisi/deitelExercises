import chapterEight.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.Diary;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
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
        diary.findEntry(2);
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

}
