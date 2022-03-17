package personal;

public class Phone {
    private boolean isOn;
    private String camera;
    private String keypad;
    private String speaker;

    public Phone(boolean isOn, String camera, String keypad, String speaker )
    { this.isOn = isOn;
    this.camera = camera;
    this.keypad = keypad;
    this.speaker = speaker;}

    public void setOn(boolean isOn)
    {this.isOn = isOn;}

    public boolean isOn()
    {return isOn;}

    public void setCamera(String camera)
    {this.camera = camera;}
    public String getCamera()
    {return camera;}

    public void setKeypad (String keypad)
    {this.keypad = keypad;}
    public String getKeypad()
    {return keypad;}

    public void setSpeaker( String speaker)
    {this.speaker = speaker;}

    public String getSpeaker()
    {return speaker;}



}
