package Student;

/**
 * Created by IT_School on 17.10.2015.
 */
public class Main {
    public static void changeId(Student p) {
        p = (Student) p.clone();
        p.setId(1000);
        System.out.println("-> id = " + p.getId());
    }

    public static void main(String[] args) {
        Student ob = new Student();
        System.out.println("id = " + ob.getId());
        changeId(ob);
        System.out.println("id = " + ob.getId());
    }
}
