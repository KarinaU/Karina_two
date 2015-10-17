package Student;

/**
 * Created by IT_School on 17.10.2015.
 */
public class Student implements Cloneable {
    private int id = 71;

    public int getId() {
        return id;
    }

    public void setId(int value) {
        id = value;
    }

    public Object clone(){
        try{
            return super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError("??????????!");
        }
    }
}
