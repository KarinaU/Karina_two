package as;

/**
 * Created by IT_School on 18.10.2015.
 */
public class Ball {
    public static int count = 0;

    static  int getCountInstance(){
        return count;
    }

    private String colour  = "none";
    public Ball(String colour){
        this.colour = colour;
        count++;
    }

    protected void finalize(){
        System.out.println("ASD");
        count--;
    }
}
