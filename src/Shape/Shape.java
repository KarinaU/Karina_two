package Shape;

/**
 * Created by IT_School on 18.10.2015.
 */
public abstract class Shape {
    protected String colour = "red";

    public abstract void draw();

    public Shape(String colour){
        this.colour = colour;
    }
}
