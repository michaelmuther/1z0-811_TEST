public class TernaryOperator1 {

    public static void main(String[] args) {
        int i = 10;
        System.out.println( i<20 ? out1() : out2() );
// MM note: the ternary operator does not need to create an assignment
//        Assume that out1 and out2 have method signature: public void out1(); and public void out2();.
    }

//    public static void out1() { // ternary operator cannot return void
    public static String out1() {
        return "farts";
    }

    public static String out2() {
        return "farts2";
    }
}

/*
The following code snippet will not compile...

int i = 10;
System.out.println( i<20 ? out1() : out2() );

Assume that out1 and out2 have method signature: public void out1(); and public void out2();.
Answered Correctly

You had to select 1 option(s)
True
False


It is not permitted for either the second or the third operand expression of the :? operator to be an invocation of a void method.
 */
