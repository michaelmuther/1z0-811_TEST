public class DecisionStatement11
{
//    static Object obj1;
//    static Object obj2;

    public static void main(String[] args)
    {
        Object obj1 = new Object();
//        Object obj1 = null; //
        Object obj2 = obj1;

        if( obj1.equals(obj2) ) System.out.println("true");
        else  System.out.println("false");
    }
}

/*
Object class's equals() method just checks whether the two references are pointing to the same location or not.
In this case they really are pointing to the same location because of obj2 = obj1; so, it returns true.

Null is not an object.  An object can be set to null;
 */