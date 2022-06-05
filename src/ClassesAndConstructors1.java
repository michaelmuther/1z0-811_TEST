public class ClassesAndConstructors1
{
    //Which lines contain a valid constructor in the following code?
    public ClassesAndConstructors1(int a, int b) { } // 1 // correct
    public void ClassesAndConstructors1(int a) { }   // 2
    //Constructors cannot return anything. Not even void.
    //It is interesting to note that public void TestClass(int a) {} // 2 will actually compile. It is not a constructor, but compiler considers it as a valid method!
//    public ClassesAndConstructors1(String s); // 3 // not corrrect
    //Constructors cannot have empty bodies (i.e. they cannot be abstract)
    private ClassesAndConstructors1(String s, int a) { }     //4 // correct
    //You can apply public, private, protected to a constructor. But not static, final, synchronized, native and abstract.
    public ClassesAndConstructors1(String s1, String s2) { }; //5 // correct
    //The compiler ignores the extra semi-colon.
}
