package tddClass;

public class TelevisionSet {
    private boolean isOn;
    private  int volume;
    private int channel;
    private boolean mode;

    public void onAndOffTvSet(boolean on) {this.isOn = on;
    }

    public boolean isOn() {
        return isOn;
    }

    public void increaseVol() {
        volume = volume + 1;
    }
    public int getVolume(){
        return volume;
    }

    public void decreaseVol() {
        volume = volume - 1;
    }

    public void setChannel(int chan ) {
        channel = chan;
    }

    public void increaseChannel() {
        channel = channel + 1;
    }

    public void decreaseChannel() {
        channel = channel - 1;
    }


    public int getChannel(){
        return channel;
    }

    public void mute(boolean mode) {this.mode = mode;
    }
    public boolean turnMute(){
        return mode;
    }

}
