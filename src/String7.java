public class String7 {
    public static void main(String[] args) {
        int index = 1;
        String[] strArr = new String[5];
        String  myStr  = strArr[index];
        System.out.println(myStr);
    }
}
/*
Answered Correctly

You had to select 1 option(s)
It will print nothing.
It will print null.
It will throw ArrayIndexOutOfBoundsException at runtime.
Array (and ArrayList) indexing starts with 0. Here, since index is 1 and the length of the array pointed to by strArr is 5, strArr[index] is valid. It will not cause an ArrayIndexOutOfBoundsException.
It will print some junk value.
None of the above.


When you create an array of Objects all the elements are initialized to null.
In this question, we are creating array of Strings. A String is also an Object.
So, in the line 3, null is assigned to myStr.

Note that empty String is "" (String str = ""; ) and is not same as null.
 */