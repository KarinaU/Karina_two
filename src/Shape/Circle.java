package Shape;

/**
 * Created by IT_School on 18.10.2015.
 */
public class Circle extends Shape {

    protected int x,y,r;

    public Circle(int x, int y, int r, String colour){
        super(colour);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void draw(){
        System.out.println("Drawing circle (x="+x+", y="+y+", radius="+r+", colour="+super.colour+")");
    }
}
