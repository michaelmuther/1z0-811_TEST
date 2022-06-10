import java.io.File;

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

class References
{
    String s1;
    String s2 = null;
//    Integer i1 = new Integer();
    int i2;
    File f;
    Object b = f;
}

//    How many object references are bring created?  // NOTE REFERENCES, not objects
// answer is 5 references (only 1 object is created, the new Integer
/*
  String s1;  // s1 is a reference of class String. Since it is an instance member, by default, it is initialized to point to null.
  String s2 = null; // s2 is a reference of class String. It has been explicity set to point to null.
  Integer i1 = new Integer(); // i1 is a reference of class Integer. It is pointing an Integer object created using new.
  int i2; // i2 is a primitive. It is not a reference.
  File f; // f is a reference of class File. It is pointing to null.
  Object b = f; // b is a references of class Object. It has been set to point to the object pointed to by f. Since f is pointing to null, b will also point to null).

Thus, in all there are 5 object references - s1, s2, i1, f, and b.
There is only one object, created at new Integer().
There is only one primitive, i.e. i2.
 */
