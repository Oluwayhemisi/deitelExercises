import org.junit.jupiter.api.Test;
import tddClass.TelevisionSet;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionSumSetTest {
    @Test
    public void onTelevisionSet(){
        //given
        TelevisionSet samsung  = new TelevisionSet();
        //when
        samsung.onAndOffTvSet(true);
        //assert
        //assertFalse(samsung.isOn());
        assertTrue(samsung.isOn());

    }

    @Test
    public void increaseVolumeTest(){
    //given
        TelevisionSet samsung  = new TelevisionSet();
        //when
        samsung.increaseVol();
        samsung.increaseVol();
        samsung.increaseVol();
        samsung.increaseVol();
        //assert
        assertEquals(4,samsung.getVolume());
    }
    @Test
            public void decreaseVolumeTest(){
        //given
        TelevisionSet samsung  = new TelevisionSet();
        //when
        samsung.increaseVol();
        samsung.increaseVol();
        samsung.increaseVol();
        samsung.increaseVol();
        samsung.decreaseVol();
        //assert
        assertEquals(3,samsung.getVolume());

    }
    @Test
    public void channelTest(){
        //given
        TelevisionSet samsung  = new TelevisionSet();
        //when
        samsung.setChannel(23);
        //assert
        assertEquals( 23,samsung.getChannel());

    }
    @Test

    public void increaseChannelTest(){
        TelevisionSet samsung  = new TelevisionSet();
        //when
        samsung.increaseChannel();
        samsung.increaseChannel();
        samsung.increaseChannel();
        samsung.increaseChannel();
        //assert
        assertEquals(4,samsung.getChannel());
    }

    @Test
    public void decreaseChannelTest(){
        TelevisionSet samsung  = new TelevisionSet();
        //when
        samsung.increaseChannel();
        samsung.increaseChannel();
        samsung.increaseChannel();
        samsung.increaseChannel();
        samsung.increaseChannel();
        samsung.increaseChannel();
        samsung.increaseChannel();
        samsung.decreaseChannel();
        //assert
        assertEquals(6,samsung.getChannel());
    }


    @Test
    public void muteTest(){
        //given
        TelevisionSet samsung  = new TelevisionSet();
        //when
        samsung.mute(true);
        //assert
        assertTrue(samsung.turnMute());
    }


}
