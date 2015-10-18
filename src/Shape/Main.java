package Shape;

/**
 * Created by IT_School on 18.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Circle (10,5,3,"red");
        shape[1] = new Kvadrat(14,13,12,11,"yellow");
        shape[2] = new Circle(25,24,23,"blue");

        for(int i=0; i<shape.length; i++)
            shape[i].draw();
    }
}
