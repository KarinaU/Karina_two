package Box;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by IT_School on 18.10.2015.
 */
public class BlackBoxDemo {
    public static void main(String[] args) {
        BlackBox object1 = new BlackBox(5,10);
        BlackBox object2 = new BlackBox(5,10);

        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());

        System.out.println(object2.hashCode() == object1.hashCode());
        // ?????? ???? true
    }
}
