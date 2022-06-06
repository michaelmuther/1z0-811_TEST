public class String3 {

    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        System.out.println(s1 == s2); //1 // this is true because the JVM checks for an identical String literal in the pool upon assignment
        System.out.println(s1 == s3); //2
        System.out.println(s1.equals(s2));//3
        System.out.println(s2.equals(s3)); //4
    }
}
/*
The JVM maintains a pool of all the String objects. Whenever you use a String literal (i.e. a string within double quotes),
the JVM checks whether that string already exists in the pool or not. If the string exists, then it uses the same String object instead of creating a new one.
This is called interning of Strings. Because of this, s1 and s2 get a reference to the same string object containing "java". That is why, s1 == s2 evaluates to true.

When you create a string using the new operator, interned strings are not used and a new String object is created.
Because of this, s3 gets a completely new String object different from the one pointed to by s1 and s2. That is why, s1 == s3 returns false.

equals() method of String checks whether the contents of the two String objects are same or not. Thus, s1.equals(s2) and s2.equals(s3) both return true.

Remember that == checks whether two references point to the same object or not, while the equals method checks whether two objects contain the same thing or not.
 */