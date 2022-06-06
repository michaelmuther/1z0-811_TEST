public class Operators1 {
}
// Which of the following are NOT valid operators in Java?
// sizeof
// It is a valid operator in C++ but not in java.
// Since the size of all objects is always known at compile time itself,
// there is no need for this operator in Java.

// <<<
/*
<< is a valid operator for shifting the bits of a number to the left.
Note that unlike the right shift operators (>> and >>>) which shift the bits to the right with or without the sign,
there is no difference between shifting a signed value and an unsigned value to the left, and so,
there is no need for <<< operator.
 */

// instanceof
// It is a valid operator in Java.

// mod
/*
There is no such operator. There is a % operator, which compute the modulus/remainder. For example, 10%3 = 1
10%-3 = 1
-10%3 = -1
-10%-3 = -1;
 */

// equals
// boolean equals(Object o) is a method in java.lang.Object. It is not an operator.