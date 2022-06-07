public class DecisionStatements9 {
    public static void main(String[] args) {
        byte test = 127;
        test(test);
    }

    static void test(byte x)
    {
        switch(x)
        {
            case 'a':   // 1
//            case 256:   // 2 // byte is only -128 to 127
            case 0:     // 3
            default :   // 4
            case 80:    // 5
        }
    }
}
/*
Answered Correctly

You had to select 1 option(s)
Line 1 as 'a' is not compatible with byte.
int value of 'a' can easily fit into a byte.
Line 2 as 256 cannot fit into a byte.
No compile time error but a run time error at line 2.
Line 3 as the default label must be the last label in the switch statement.
Any order of case statements is valid.
There is nothing wrong with the code.


Every case constant expression in a switch block must be assignable to the type of switch expression.
Meaning : /// byte by = 10; switch(by) { case 300 : //some code; case 56 : //some code; } ///
This will not compile because 300 is not assignable to the variable 'by ', which can only hold values from -128 to 127.
The compiler detects this issue while compiling and generate the error message: ///incompatible types: possible lossy conversion from int to byte///
The use of break keyword is not mandatory. Without the break statement, the control will simply fall through the case statements one after another.
 */



/* SWITCH STATEMENT
Which of the following statements concerning the switch construct are true?

A character literal can be used as a value for a case label. TRUE
byte, char, short, int, String, and enums can be used.
boolean, long, float and double cannot be used.

A 'long' cannot be used as a switch variable.TRUE
boolean, long, float and double cannot be used.

An empty switch block is a valid construct. TRUE

A switch block must have a default label. FALSE

If present, the default label must be the last of all the labels. FALSE
Any order is valid.
 */

/*
Here are the rules for a switch statement:
boolean, long, float and double cannot be used for the case labels.
All of the following must be true, or a compile-time error will result:
1.Every case constant expression associated with a switch statement must be assignable to the type of the switch
Expression. ie. if the switch expression is of type byte then all the case constants must fit in a byte.
(e.g. you can't you 200 as a case value)
2. No two of the case constant expressions associated with a switch statement may have the same value.
3. At most, one default label may be associated with the same switch statement.
(It is valid to not have default label at all.)
 */
/*  BOOLEAN CONDITIONAL STATEMENT
Which of the following statements are used to implement a boolean conditional statement in Java?
Answered Incorrectly

You had to select 2 option(s)
if TRUE
else-if FALSE
There is no such statement in Java.
else TRUE
if-then-else FALSE
There is no such statement in Java.
switch FALSE
It supports only integral and enum types.
for FALSE
This is used for iteration.


A standard conditional statement is like this:

if( someCondition such as i<10 ) {
  //statements
}
else {
  //statements
}
 */