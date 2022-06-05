public class DecisionStatements2
{
    public static void main(String[] args)
    {
        if (args[0].equals("open"))
            if (args[1].equals("someone"))
                System.out.println("Hello!");
            else System.out.println("Go away "+ args[1]); // else belongs to the innermost if; this is arbitrary but part of the language.
    }
}

// if run with "open", it throws an ArrayIndexOutOfBoundsException
// if run with "closed", it will end without exception and print nothing
// if run with "closed open", it will end without exception and print nothing
// if run with "open closed", it will print "Go away closed"
// if run with no args, it throws an ArrayIndexOutOfBoundsException
// if run with "open someone", it will print "Hello!"

/*As in C and C++, the Java if statement suffers from the so-called "dangling else problem," The problem is that both the outer if statement and the inner if statement might conceivably own the else clause.
In this example, one might be surprised that the programmer intended the else clause to belong to the outer if statement.
The Java language, like C and C++ and many languages before them, arbitrarily decree that an else clause belongs to the innermost if so as the first if() condition fails (args[0] not being "open") there is no else associated to execute. So, the program does nothing. The else actually is associated with the second if. So had the command line been :
java Test open, it would have executed the second if and thrown ArrayIndexOutOfBoundsException.
If the command line had been:
java Test open xyz, it would execute the else part(which is associated with the second if) and would have printed "Go away xyz".
*/
