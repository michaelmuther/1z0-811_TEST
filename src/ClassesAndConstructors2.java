public class ClassesAndConstructors2
{
    static int someInt = 10;
    public static void changeIt(int a)
    {
        a = 20;
    }
    public static void main(String[] args)
    {
        changeIt(someInt);
        System.out.println(someInt);
    }
}

/*
Java uses "pass by value" semantics for parameter passing, the value of someInt, which is 10, is passed to the changeIt method.
Thus, the variable a gets the value 10. Next, a is assigned the value 20. However, this doesn't affect the someInt field,
which still has the value 10. Therefore, when someInt is printed in main, 10 is printed.
 */