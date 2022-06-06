public class DecisionStatements7 {

    public static void main(String[] args) {
        int x = 0;
//        while (false) { x=3; } // unreachable statement
        if (false) { x=3; }
        do{ x = 3; } while(false);
        //In a do- while, the block is ALWAYS executed at least once.
        for( int i = 0; i< 0; i++) x = 3;
    }
}
/*
while (false) { x=3; } is a compile-time error because the statement x=3; is not reachable.
The compiler notices that the while condition will never be satisfied and so the while block can never be executed and so, it generates an error.

for( int i = 0; false; i++) x = 3; is also a compile time error because x= 3 is unreachable.
(Observe that this code is different from the code shown in Option 4).

In if(false){ x=3; }, although the body of the condition is unreachable, this is not an error
because the Java Language Specification explicitly defines this as an exception to the rule.
It allows this construct to support optimizations through the conditional compilation. For example,

if(DEBUG){ System.out.println("beginning task 1"); }

Here, the DEBUG variable can be set to false in the code while generating the production version of the class file,
which will allow the compiler to optimize the code by removing the whole if statement entirely from the class file.
 */
