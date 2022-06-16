package abstraction;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayListTest extends ArrayList {
    @Test
    public void addTest() {
        List list = new ArrayList();
        list.add("Boxers for boyfriends");
        assertEquals(1, list.size());
    }

    @Test
    public void removeTest() {
        List list = new ArrayList();
        list.add("String on a guitar");
        list.add("blue moon");
        list.add("cake");
        list.remove(0);
        assertEquals(2, list.size());
    }

    @Test
    public void addAndGetTest() {
        List list = new ArrayList();
        list.add("shirt");
        list.add("Trouser");
        assertEquals("shirt", list.get(0));
        assertEquals("Trouser", list.get(1));
    }

    @Test
    public void removeByItemTest() {
        List list = new ArrayList();
        list.add("shirt");
        list.add("pants");
        list.remove("shirt");
        assertEquals(1, list.size());
    }

    @Test
    public void expandArrayLengthByItemTest() {
        List list = new ArrayList();
        list.add("good");
        list.add("goo");
        list.add("go");
        list.add("goat");
        list.add("gush");
        list.add("give");
        list.add("gift");
        assertEquals(7, list.size());

    }

    @Test
    public void expandArrayLengthByIndexTest() {
        List list = new ArrayList();
        list.add("g");
        list.add("go");
        list.add("goo");
        list.add("good");
        list.add(1, "goat");
       assertEquals("goat", list.get(1));
       assertEquals("go", list.get(2));
        assertEquals(5, list.size());

    }
}