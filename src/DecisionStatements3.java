public class DecisionStatements3 {

    public static void main(String[] args) {
        test(4);
    }

    static void test(int x)
    {
        // this is a valid switch statement:
        switch(x)
        {
            case 1:
            case 2:
            case 0:
            default :
            case 4:
        }
    }
    // Any order of case statements is valid.
    // Break statement is not required
    // any order is valid. Ordering is important though
    // data type x is valid

}
