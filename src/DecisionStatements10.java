public class DecisionStatements10 {

    public static void main(String[] args) {
        max1(1,2);
        max2(1,2);
        max4(1,2);
    }

//    Which of the following implementations of a max() method will correctly return the largest value?
//    Answered Incorrectly

//    You had to select 1 option(s)
    static int max1(int x, int y)
    {
        if(x > y){ return x; } else{ return y;}
    }
//    The if statement does not return any value. Therefore, it can not be used the way it is used here.

    static int max2(int x, int y)
    {
        if(x > y){ return x; }  else { return y; }
    }
//    It would work if the first return and the corresponding brackets are removed.
//            if(x > y){ return x; }  else{ return y; }

//    int max3(int x, int y) // FALSE
//    {
//        switch(x < y) // only char, byte, short, int, Character, Byte, Short, Integer, String, enum
//        {
//            case true:
//                return y;
//            default :
//                return x;
//        };
//    }
//    Neither the switch expression nor the case labels can be of type boolean.

    static int max4(int x, int y)
    {
        if (x > y)  return x;
        return y;
    }
}
