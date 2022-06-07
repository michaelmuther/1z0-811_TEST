public class Methods3
{
    public int methodA(int a){  return a*2; } //1
//    public long methodA(int a){  return a; } //2
    public static void main(String[] args)
    {
        int i = 0;
        i = new Methods3().methodA(2);
        System.out.println( i );
    }
}
/*
Method signature of a method comprises the method name and the ordered list of input parameter types.
The return type, the names of the parameters, and the throws clause (if present) are not considered in determinining the method signature.
Now, if a class has more than one method with the same method name but different signatures,
then that method is said to be overloaded.

You cannot have two methods having the same signature in the same class because then the compiler will not be able to decide which method to call when it finds an invocation of that method.

So, in the code given in this question, the two methods have the same signature, which is illegal. Thus, the code will not compile.
 */

/*
Which of the following statements are true?
Answered Correctly

You had to select 2 option(s)
A static method can call other non-static methods in the same class by using the 'this' keyword. FALSE
There is no 'this' for static methods.

A class may contain both static and non-static variables and both static and non-static methods. TRUE

Every object of a class has its own instance of each non-static member variable. TRUE

Instance methods may access local variables of static methods. FALSE
Local variables (also known as automatic variables) are variables that are defined inside a method. They can be accessed only within that method.

All methods in a class are implicitly passed a 'this' parameter when called. FALSE
All non-static methods are implicitly passed a 'this' parameter when called.


The keyword 'this' can only be used in non-static methods. In any case, static methods cannot access non static fields or methods.
Note : you can't do somthing like

this = new Object();
 */