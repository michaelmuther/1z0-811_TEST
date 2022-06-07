public class String6 {
    public static void main(String[] args) {
        int marks = 90;
        double marks2 = 90.0;
        String exam = "OCJA";
        System.out.printf("I scored %s marks in the %s %s exam!",  marks2, exam, "farts" );
//        System.out.printf("I scored %d marks in the %s exam!",  marks, exam );

    }
}
/*
Exception will be thrown at run time.
The first format specifier is %d, so, the first argument should be an integer value.
exam is a String and that will cause an exception to be thrown
 */

/*
You need to remember only the following rules for formatting strings using format specifiers:

1. %s is used to format string values. But if you pass other types such as int or double, that is fine. They will be converted to their string representations.
For example, System.out.printf("hello %d %s ", 10, 20); will print hello 10 20 even though 20 is not a String.

2. %d is used to format integer values. If you pass a string or any other type, a java.util.IllegalFormatConversionException is thrown.
For example, System.out.printf("hello %d %s ", "10", 20); will throw an exception because "10" is not an integer. It is a String.
System.out.printf("hello %d ", 10.0); will also throw an exception because 10.0 is not an integer. It is a double.

3. %n just inserts a line separator or new line character at that location in the output string.

4. Arguments are inserted into the resulting output String in the same order as the order of the print specification. It is possible to insert the arguments at different locations but that is beyond the scope of this exam.

5. Extra arguments are ignored. But less arguments that expected in the input string causes an exception.

There are several other options that can be used to customize the string formatting but they are out of scope for this exam.
 */