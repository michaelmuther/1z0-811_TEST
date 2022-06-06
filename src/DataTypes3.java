public class DataTypes3 {

    public static void main(String[] args) {
//        float f1 = 1.0;
        //1.0 is a double as double is the default for a floating-point number in java
//        float f2 = 43e1;
        // 43e1 is a double as double is the default for a floating point number, and scientific notation is just another way to write a double number.
/* Scientific notation is just another way to write a double number.
In scientific notation, the letter E (or e) is used to mean "10 to the power of."
For example, 43e1  means  43 * 10^1  which is 430.0.
Note: You will not be asked to decipher a number written in this format in the exam but it is good to know anyway.
 */
        float f3 = -1;
        float f4 = 0x0123;
        float f5 = 4;

//        System.out.println(f2);
    }
}
// Although 1.0 and 43e1 can fit into a float, the implicit narrowing does not happen because
// implicit narrowing is permitted only among byte, char, short, and int.

// Float is of size 32 bits while double is of size 64 bits.
/*
Default: Double is the default data type used by Java for dealing with fractional numbers.
To force Java to use the float data type, the character ‘f’ or ‘F’ must be suffixed to the number.
This can also be done by forcibly typecasting the number to float by prefixing (float) to the number at the time of initialization.
 */
