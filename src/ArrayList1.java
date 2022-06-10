import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("a");
        if(s1.remove("a")){ // returns true if object is in arrayList, first instance of "a" removed
            if(s1.remove("a")){ // 2nd "a" is removed and true returned
                s1.remove("b"); // "b" is removed; only "c" remains
            }else{
                s1.remove("c"); // code does not execute
            }
        }
        System.out.println(s1); // only "c" remains
    }
}

/*
ArrayList's remove(Object ) method removes the first occurence of the given element and returns true if found. It does not remove all occurences of the element. In this case, the first call to s1.remove("a"); will remove only the first "a" and return true, the second call to remove("a") will remove the second "a" and return true. Finally, the call to remove("b") will remove "b". Therefore, only "c" will be left in the list.

The JavaDoc API description of this method is important for the exam -

public boolean remove(Object o)
Removes the first occurrence of the specified element from this list, if it is present (optional operation). If this list does not contain the element, it is unchanged. More formally, removes the element with the lowest index i such that (o==null ? get(i)==null : o.equals(get(i))) (if such an element exists). Returns true if this list contained the specified element (or equivalently, if this list changed as a result of the call).
 */

/*
All implementations of List including ArrayList can be sorted by using the
sort() method of the Collections class.

Collections.sort(l);

To sort by natural ordering, the class of the elements must implement a Comparable
interface.

If we have multiple threads to add or remove elements from an ArrayList, we need
to write additional code to ensure thread safety.

The performance of ArrayList and Arrays is more or less the same.
 */
