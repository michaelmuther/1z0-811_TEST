public class JavaBasics1 {

    public static void main(String[] args) {
       // Given that JavaBasics1 is a class, how many objects and
        // reference variables are created by the following code?

        JavaBasics1 t1, t2, t3, t4;
        t1 = t2 = new JavaBasics1();
        t3 = new JavaBasics1();

    }
}
/*
2 Objects, 4 references
two news => two objects. t1, t2, t3, t4 => 4 references.

A declared reference variable exists regardless of whether a reference value
(i.e. an object handle) has been assigned to it or not.
 */