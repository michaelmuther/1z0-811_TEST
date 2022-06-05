import java.util.ArrayList;

public class Loops1 {
    public static void main(String[] args) {
        Object o = null;
        ArrayList<Integer> c = new ArrayList<>();//valid ArrayList object.
        c.add(1);
        c.add(2);
        c.add(3);
        int[] ia = {1, 2, 3}; //valid array

//        for(o : c){ } // does not compile
// Cannot use an existing/predefined variable in the variable declaration part.
        for(final Object o2 :c){ } // compiles and runs
        // final is the only modifier (excluding annotations) that is allowed here.
        for(int i : ia) { } // compiles and runs
        // Since ia is an array of ints, each element of ia is an int. Thus, ia's elements can be assigned to an int.
//        for(Iterator it : c.iterator()){ } // does not compile
// c.iterator() does not return any Collection. Note that the following would have been valid:
//Collection<Iterator> c = //some collection that contains Iterator objects
//for(Iterator it : c){ }
//        for(int i = 1; i<=ia.length; i++){  System.out.println(ia[i]); } // compiles but returns ArrayIndexOutOfBoundsException
/* Remember that array indexing starts with 0. It means, the index of the first element is 0 and the index of the last element is length-1.
Therefore, this loop will not print the first element in the array and will throw an ArrayIndexOutOfBoundsException upon executing System.out.println(ia[i]); for the last iteration when i equals to  ia.length.
*/
    }
}
