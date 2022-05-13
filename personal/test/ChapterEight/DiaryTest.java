//package ChapterEight;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import tdd.Diary;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class DiaryTest {
//    private Diary diary;
//
//    @BeforeEach
//    void setUp() {
//        diary = new Diary("1234");
//    }
//
//    @Test
//    void notNull() {
//        assertNotNull(diary);
//    }
//
//    @Test
//    void testPassword() {
//        diary.setPassword("1234");
//        assertEquals("1234", diary.getPassword());
//    }
//
//    @Test
//    void diaryHasEntriesTest() {
//        assertEquals(0, diary.checkNumberOfEntries());
//    }
//
//    @Test
//    void createEntryTest() {
//        diary.setPassword("1234");
//        diary.createEntries("My life", "My name is Yemisi", "1234");
//        assertEquals(1, diary.checkNumberOfEntries());
//
//        diary.createEntries("School", "I finished from LASU", "1234");
//        assertEquals(2, diary.checkNumberOfEntries());
//
//        diary.createEntries("Social", "I love parties", "1234");
//        assertEquals(3, diary.checkNumberOfEntries());
//
//
//    }
//
//    @Test
//    void findEntryTest() {
//        diary.setPassword("1234");
//        diary.createEntries("My life", "My name is Yemisi", "1234");
//        assertEquals(1, diary.checkNumberOfEntries());
//
//        diary.createEntries("School", "I finished from LASU", "1234");
//        assertEquals(2, diary.checkNumberOfEntries());
//
//        diary.createEntries("Social", "I love parties", "1234");
//        assertEquals(3, diary.checkNumberOfEntries());
//
//        Entries entries = diary.findEntry(2);
//        assertEquals("School", entries.getTitle());
//        assertEquals("I finished from LASU", entries.getBody());
//    }
//
//    @Test
//    void deleteEntryTest(){
//            diary.setPassword("1234");
//            diary.createEntries("My life","My name is Yemisi","1234");
//            assertEquals(1, diary.checkNumberOfEntries());
//
//            diary.createEntries("School","I finished from LASU","1234");
//            assertEquals(2,diary.checkNumberOfEntries());
//
//            diary.createEntries("Social","I love parties","1234");
//            assertEquals(3,diary.checkNumberOfEntries());
//
//            Entries entries = diary.deleteEntry(2);
//            assertEquals("School",entries.getTitle());
//            assertEquals("I finished from LASU",entries.getBody());
//
//            }
//
//        @Test
//        void lockDiaryTest(){
//              diary.isLock("1234");
//            assertTrue(diary.isLock("1234"));
//                }
//
//                @Test
//    void unlocked(){
//        diary.isLock("1234");
//        diary.isLock("1234");
//        assertFalse(diary.isLock("1234"));
//                }
//            }


//}