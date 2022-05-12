package abstraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



class ArrayListTest extends ArrayList {
    @Test
    public void addTest(){
        List list = new ArrayList();
        list.add("Boxers for boyfriends");
        assertEquals(1,list.size());
    }
    @Test
    public void removeTest(){
        List list = new ArrayList();
        list.add("String on a guitar");
        list.remove(0);
        assertEquals(0,list.size());
    }
    @Test
    public void addAndGetTest(){
        List list = new ArrayList();
        list.add("shirt");
        list.add("Trouser");
        assertEquals("shirt",list.get(0));
        assertEquals("Trouser",list.get(1));
    }

}