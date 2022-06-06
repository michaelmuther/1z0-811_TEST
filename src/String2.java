public class String2
{
    public static void main(String args[] )
    {
        String str1 = "str1";
        String str2 = "str2";
        System.out.println( str1.concat(str2) );
        System.out.println(str1);
    }
}

/*
str1.concat(str2) actually creates a new object that contains "str1str2".
So it does not affect the object referenced by str1 .

Note that String objects are immutable.
No matter what operation you do, the original object will remain the same and a new object will be returned.
Here, the statement str1.concat(str2) creates a new String object which is printed but its reference is lost after the printing.
 */