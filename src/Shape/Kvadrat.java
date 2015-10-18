package Shape;

/**
 * Created by IT_School on 18.10.2015.
 */
public class Kvadrat extends Shape {
    protected int x,y,x1,y2;

    public Kvadrat(int x, int y, int x1,int y2, String colour){
        super(colour);
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y2 = y2;
    }

    public void draw(){
        System.out.println("Drawing kvadrat (x="+x+", y="+y+", x1="+x1+", y2="+y2+", colour="+super.colour+")");
    }
}
