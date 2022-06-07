public class Methods4
{
    public void test()
    {
        test1(10);       //1
        test1(10, 20, 30, 40, 50); //2
    }

    public static void main(String[] args)
    {
        new Methods4().test();
    }

//    public void test1(int i, int j){} // does not work
//    public void test1(int i, int... j){} // this works
    public void test1(int... i){} // this works also
//    public void test1(int i...){} // does not work
//    public void test1(int[] i){} // does not work
}

/*
Answered Correctly

You had to select 2 option(s)
public void test1(int i, int j){}
This will work only for //2.
public void test1(int i, int... j){}
The last parameter is a varargs of type int, which means, it can take any number of integers. Thus, it satisfies both //1 and //2.
public void test1(int... i){}
Since the only parameter is a varargs of type int, it can take any number of integers. Thus, it satisfies both //1 and //2.
public void test1(int i...){}
This is not a correct syntax for a var-arg parameter.
public void test1(int[] i){}
Even though a var-arg parameter of type int is very similar to int[], they are not interchangeable. Therefore, int[] cannot be substituted for int... and it will not satisfy either of //1 or //2.


An interesting observation is that if you do javap on the following class, you will see the same signature for methods m1 and m2. This shows that a var-arg parameter of type T is same as an array of type T.


class TestClass {
    String m1(int[] i) { return ""+i.length; }
    String m2(int... i) { return ""+i.length; }
}


javap TestClass produces this:

    java.lang.String m1(int[]);
    java.lang.String m2(int[]);


Therefore, the following code will not compile:

class TestClass {
    String m1(int[] i) { return ""+i.length; }
    String m1(int... i) { return ""+i.length; }  // Compiler determines that this is a duplicate method.
}
 */