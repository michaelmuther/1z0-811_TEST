public class String1 {
    public static void main(String[] args) {
        String test = "test";
        String test2 = "test2";
//        String test3 = test * test2;
        String[] testes = test.split("t");
//        test = test++;
//        test += test; works
        System.out.println(test);
    }
}
// operators that can be used with the String object:
// +
// +=
// .

//Cannot use: ++ or *

/*
Only + and += are overloaded for Strings. a+=x is actually converted to a = a + x.
So, it is valid for Strings. The dot (.) operator accesses members of the String object.
There is only one member variable though: CASE_INSENSITIVE_ORDER. It is of type Comparator.
 */
