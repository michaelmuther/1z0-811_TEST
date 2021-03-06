public class DataTypes5 {

    public static void main(String[] args) {
        System.out.println(1 + 2 + "3"); // would print 33. TRUE
        System.out.println("1" + 2 + 3); // would print 15. FALSE prints 123
        System.out.println(4 + 1.0f); // would print 5.0 TRUE
        System.out.println(5/4); // would print 1.25 FALSE prints 1
        System.out.println('a' + 1 ); // would print b. FALSE prints 98
    }
}

/*
System.out.println(1 + 2 + "3"); would print 33.
operator + is left associative so evaluation of (1 + 2 + "3" ) is as follows: ( 1 + 2 ) + "3" -> 3 + "3" -> "33".
System.out.println("1" + 2 + 3); would print 15.
evaluation of ("1" + 2 + 3) is as follows : ("1" + 2) + 3 -> "12" + 3 -> "123".
System.out.println(4 + 1.0f); would print 5.0
(4 + 1.0f ) evaluates as 4.0f + 1.0f ->5.0f -> 5.0
System.out.println(5/4); would print 1.25
(5/4) performs integer division because both 5 and 4 are integers, resulting in the value 1.
System.out.println('a' + 1 ); would print b.
Both operands in the expression ( 'a' + 1 ) will be promoted to int => 97 + 1 = 98


All operands of type byte, char, and short are promoted AT LEAST to an int before performing mathematical operations.
If one of the operands is larger than an int then the other one is promoted to the same type.

Note that System.out.println((float)5/4); will print 1.25. But if you remove the explicit cast (float), it will print 1.
 */