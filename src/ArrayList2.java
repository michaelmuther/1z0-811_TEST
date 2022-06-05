
import java.util.* ;
public class ArrayList2
{
    public static void main(String args[])
    {
        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add(1, "c"); // becomes a, c, b
        List s2 = new ArrayList(  s1.subList(1, 1) ); // does not affect s1
        // sbulist returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        // (If fromIndex and toIndex are equal, the returned list is empty.)
        s1.addAll(s2); // s2 is empty, so nothing is added to s1
        System.out.println(s1);
//        System.out.println(s2);
    }
}

/*
First, a and b are appended to an empty list. Next, c is added at index 1 i.e. between a and b.
Then a new list s2 is created using the sublist view allowing access to elements from index 1 to index 1(exclusive) (which really means there are no elements!).
Now, s2 is added to s1.
But s2 is empty. So, s1 remains the same. Therefore, it prints:
a, c, b
 */
