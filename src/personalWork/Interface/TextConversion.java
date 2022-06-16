package personalWork.Interface;

public class TextConversion {
    private Input input;
    private Output output;

    public TextConversion(final Input input, final Output output){
        this.input = input;
        this.output = output;
    }

    public void showInputInUpperCase(){
        String inputText = input.fetch();
//        convert
        String uppercaseText = inputText.toUpperCase();
//        Display
        output.display(uppercaseText);
    }

}
