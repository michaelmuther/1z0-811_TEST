public class ClassAndConstructors3
{
    int value = 1;
    ClassAndConstructors3 link;
    public ClassAndConstructors3(int val){ this.value = val; }
    public static void main(String[] args)
    {
        final ClassAndConstructors3 a = new ClassAndConstructors3(5);
        ClassAndConstructors3 b = new ClassAndConstructors3(10);
        a.link = b.link;
        b.link = setIt(a, b);
//        System.out.println(a.link.value+" "+b.link.value); // calls value on object that is null; hence null pointer exception.
    }

    public static ClassAndConstructors3 setIt(final ClassAndConstructors3 x, final ClassAndConstructors3 y)
    {
        x.link = y.link; // y link is b.link here.  b.link is null
        return x;
    }

}
/*
It will not compile because 'a' is final. FALSE
'a' is final is true, but that only means that a will keep pointing to the same object for the entire life of the program.
The object's internal fields, however, can change.
It will not compile because method setIt() cannot change x.link. FALSE
Since x and y are final, the method cannot change what x and y to point to some other object but it can change the objects' internal fields.
It will print 5, 10. FALSE
It will print 10, 10. FALSE
It will throw an exception when run. TRUE
When method setIt() executes, x.link = y.link, x.link becomes null because y.link is null so a.link.value throws NullPointerException.
 */