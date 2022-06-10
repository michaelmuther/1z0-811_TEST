public class DataTypes7 {
    public static void main(String[] args) {
        char c = 320;
//        This is valid because 320 is below the maximum value that a char can take, which is 2^16 -1. Remember that char can take only positive values.
        float f = 320;
//        320 is an int and so can be assigned to a float variable. f = 320.0 is not valid as 320.0 would be a double.
        double d = 320;
//        This is valid because an int can be assigned to a double without any cast.
        byte b = 127;
        byte g = (byte) 128;
//        320 cannot fit into a byte so you must cast it.: byte b = (byte) 320;
    }
}
