package personalWork.Interface;

public class ConsoleOutput implements Output{


    @Override
    public void display(String message) {
        System.out.println(message);
    }
}
