package personalWork.Shapes;

import java.util.logging.Filter;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("I am round");
    }

    @Override
    public void apply(Filter f) {

    }

}
