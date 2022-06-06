public class DecisionStatements8 {

    public static void main(String[] args) {
        byte b = 'b';
        switchTest(b);

    }

    public static void switchTest(byte x)
    {
        switch(x)
        {
            case 'b':
                System.out.println("case 1 : " + x);
                break;// 1
            default :
                System.out.println("default: " + x);
                break;// 2
            case -2:
                System.out.println("case 3: " + x);
                break;  // 3
            case 127: //128+ does not work as the switch type must be compatible here.
                System.out.println("case 4 : " + x);
                break;// 4
        }
    }

}
/*
1. Only String, enum, byte, char, short and int types can be used as a switch variable.
long, float, double, and boolean are not allowed.

2. The order of the case labels is immaterial. default doesn't have to be the last case, although it usually is.

3. All the case constants should be assignable to the switch variable type.
For example, in the given code, had there been a case label of 128 (i.e. case 128 : //some code ),
it would not have compiled. The range of a byte is from -128 to 127 and therefore, 128 would not be assignable to the variable x.

The integral value of b is 98, which is less than 127, so, line //1 is fine.

Note: Although it is not required for the exam to know the integral values of characters,
it is good to know that all English letters (upper case as well as lower case) as well as 0-9 are below 127 and so are assignable to byte.
 */