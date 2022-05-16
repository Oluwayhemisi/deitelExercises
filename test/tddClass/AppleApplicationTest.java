package tddClass;

import org.testng.annotations.Test;

//import org.junit.jupiter.api.Test;
import personalWork.Phone;

//import static org.junit.jupiter.api.Assertions.*;

import static org.testng.AssertJUnit.*;

public class AppleApplicationTest {
    @Test
    public void appleOnTest(){
        Phone iphone = new Phone( true, "ultra-wide", "onScreen ", "ultimateEars");
        iphone.setOn(true);
        assertTrue(iphone.isOn());

    }
    @Test
    public void appleOffTest(){
        Phone iphone = new Phone( true, "ultra-wide", "onScreen ", "ultimateEars");
        iphone.setOn(false);
        assertFalse(iphone.isOn());
    }

    @Test
    public void cameraTest(){
        Phone iphone = new Phone( true, "ultra-wide", "onScreen ", "ultimateEars");
        iphone.setCamera("ultra-wide");
        assertEquals("ultra-wide",iphone.getCamera());
    }

    @Test
    public void keypadTest(){
        Phone iphone = new Phone( true, "ultra=wide", "onScreen ", "ultimateEars");
        iphone.setKeypad("onScreen");
        assertEquals("onScreen", iphone.getKeypad());
    }

    @Test
    public void speakerTest(){
        Phone iphone = new Phone( true, "ultra=wide", "onScreen ", "ultimateEars");
        assertEquals("ultimateEars", iphone.getSpeaker());
    }

}
