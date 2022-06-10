public class Methods5
{
    static int a;
    int b;

    public void incr(){
        int c = a++;
        b++;
        c++;
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String args[])
    {
        Methods5 test = new Methods5();
        test.incr();
        a++;
        test = new Methods5();
        test.incr();
    }
}
/*
What will be the output?

111
313

You need to remember the following points to answer this question:

1. static fields belong to the class and not to the instance of a class. Therefore, there is only 1 copy of the field 'a' irrespective of the number of objects of class Test that are created.

2. Every instance of a class gets its own copy of the instance fields. Therefore, every Test instance gets its own copy of the field 'b'.

3. The postfix increment operation increments the value of the variable after the expression is evaluated. Therefore, in the statement int c = a++; first, the existing value of a is assigned to c and then a is incremented.

Based on the above, it is easy to see the following:

1. in the first call to incr(), c is set to 0, then a is incremented to 1, then b is incremented to 1, and then c is incremented to 1.
Therefore, it prints 1 1 1.

2. Next, a is incremented to 2 in the main method.

3. Next, the second call to incr() is invoked on a different instance of Test. Therefore, in this new instance, a is 2 (because a is static) and b is 0.
Now, c gets 2, then a is incremented to 3. then b is incremented to 1, then c is incremented to 3.

Therefore, 3 1 3 is printed.
 */