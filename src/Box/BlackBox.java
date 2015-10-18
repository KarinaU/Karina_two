package Box;

/**
 * Created by IT_School on 18.10.2015.
 */
public class BlackBox {
    int a;
    int b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlackBox blackBox = (BlackBox) o;

        if (a != blackBox.a) return false;
        return b == blackBox.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }

    BlackBox (int varA, int varB){
        a = varA;
        b = varB;
    }
}
