public class ArrayList7 {

    public static void main(String[] args) {
        String[] sa = { "a", "b" }; //this is an array of Strings, not a String
        int k = sa.length; // for an array, it is a built-in property.
        System.out.println(k);

        String test = "test";
        int j = test.length(); // for String, it is length() method.
        System.out.println(j);

    }
}
/*
Which of the following statements about an array are correct?
Answered Incorrectly

You had to select 1 option(s)
An array can dynamically grow in size. // FALSE
Arrays cannot grow in size once created. ArrayLists can do that.

Arrays can be created only for primitive types. // FALSE
You can have arrays for objects also. For example:
Object[] objArray = new Object[4];
String[] arrayOfStrings = { "a", "b" };

Every array has a built in property named 'size' which tells you the number of elements in the array. // FALSE
It is named length and not size. ArrayList has a method named size() that returns the number of elements in the ArrayList.
String[] sa = { "a", "b" };
int k = sa.length; //k will be assigned a value of 2.
ArrayList al = new ArrayList();
int k = al.size(); //k will be assigned a value of 0.

Every array has an implicit method named 'length' which tells you the number of elements in the array. // FALSE
length for arrays is not a method.

Element indexing for arrays as well as for Lists starts at 0. // TRUE
 */

/*
length -- arrays (int[], double[], String[]) -- to know the length of the arrays

length() -- String related Object (String, StringBuilder, etc) -- to know the length of the String

size() -- Collection Object (ArrayList, Set, etc) -- to know the size of the Collection

Now forget about length() consider just length and size().

length is not a method, so it completely makes sense that it will not work on objects. It only works on arrays.
size() its name describes it better and as it is a method, it will be used in the case of those objects who work with collection (collection frameworks) as I said up there.

Now come to length():
String is not a primitive array (so we can't use .length) and also not a Collection (so we cant use .size()) that's why we also need a different one which is length() (keep the differences and serve the purpose).
 */