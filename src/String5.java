public class String5 {

    public static void main(String[] args) {

        String a, b, c;
        a = new String("hello");
        b = a;
        c = a + b;
    }
}
/*
The statement a = new String("hello"); creates not 1 but 2 String objects.
The first one containing "hello" is created in the String pool due to the presence of a constant string hello in the code.
The second string object is created in the heap area containing the same data as the first one because of the usage of the new keyword.

The statement b = a; does not create any new String.

The statement c= a+b; creates a new string in the heap containing hellohello.

So, a total of three strings are created.
 */

/*
Note: String interning is a complex topic with many nuances.
It is not mentioned explicitly in exam objectives but a few candidates have reported seeing such questions in the exam.
You should remember the following rules about this topic:

The JVM maintains a pool of all the String objects.
Whenever you use a String literal (i.e. a string within double quotes),
the JVM checks whether that string already exists in the pool or not.
If the string exists, then it uses the same String object instead of creating a new one.
This is called interning of Strings.

When you create a string using the new operator, interned strings are not used and a new String object is created.

So, for example,
String s1 = "hello"; //new interned string object containing hello is created
String s2 = "hello";  //no new object is created because the same String already exists in the string pool
String s3 = new String("hello"); //new string object is created in the heap area.

In the above code, only two string objects are created (not three).
 */