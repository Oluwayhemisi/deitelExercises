package personalWork.Interface;

public class Main {
    public static void main(String[] args) {
        Input input= new KeyboardInput();
        Output output = new ConsoleOutput();
        new TextConversion(input,output).showInputInUpperCase();
    }
}
