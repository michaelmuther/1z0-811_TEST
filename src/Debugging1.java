public class Debugging1
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 0;
//        if( x/y ) System.out.println("Good"); // You need a boolean in the 'if' condition.
            // Here, compiler sees that there is no way x/y can produce a boolean so it generates an error at compile time.
//        else  System.out.println("Bad");
        int z = x / y; // generates "/ by zero" ArithmeticException at run time.
    }
}
