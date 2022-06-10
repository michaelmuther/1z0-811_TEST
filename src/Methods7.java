public class Methods7
{
    static Methods7 ref; // what the fuck is this?  How is an object of itself static?  So ref is the same object of itself.
    String[] arguments;
    public static void main(String args[])
    {
        ref = new Methods7();
        ref.func(args); // ok because main is not calling this directly, but the call is from the static object of itself.
//        func(args); // "non-static method func cannot be referenced from a static context"

    }

    public void func(String[] args)
    {
        ref.arguments = args;  // a non-static method inside an instance can reference a static class member.
    }
}
/*
The program will fail to compile, since the static method main is trying to call the non-static method func. // FALSE
To invoke an instance method, you need a reference to the instance on which you want to invoke it. A static method
does not have an implicit "this" reference and so it cannot invoke an instance method directly.
In the given code, the instance method is being invoked on an object referred to by 'ref' (ref.func()). This is okay.

The program will fail to compile, since the non-static method func cannot access the static member variable ref. // FALSE
Non static methods can access static as well as non static methods of a class.

The program will fail to compile, since the argument args passed to the static method main cannot be passed on to the
non-static method func. // FALSE

The program will fail to compile, since method func is trying to assign to the non-static member variable 'arguments'
through the static member variable ref. // FALSE

The program will compile and run successfully. // TRUE
 */
