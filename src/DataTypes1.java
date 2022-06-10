public class DataTypes1 {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
    }
}

// Which one can hold a larger integer value, a char or a short ?
// answer is char: range is 0 to 65535
// short range is from -32,768 to 32,767.  char is signed
// Note that both char and short are integral types that use 2 bytes.
// Although sizes of char and short are same but a char can hold a larger int value
// because char does not store negative integers.

/*
The value range of an int variable is -2^31 to 2^31-1.
-2147483648
2147483647
 */