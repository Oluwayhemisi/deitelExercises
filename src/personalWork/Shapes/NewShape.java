package personalWork.Shapes;

import java.util.ArrayList;
import java.util.List;

public class NewShape {
    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape s ){
        shapes.add(s);
    }

    public void draw(){
        shapes.forEach(Shape::draw);
    }
    public void blur(){
        shapes.forEach(s -> s.apply(new BlurFilter()));
    }
//    public void filter(Filter filter){
//        shapes.forEach(s -> filter.applyTo(s));
//        Filter
//    }
}
