public class ClassesAndConstructors4 {
}
/*
Which of these statements are true?
Answered Incorrectly

You had to select 2 option(s)
All classes must explicitly define a constructor. FALSE
A default no-args constructor will be provided by the compiler if there is explicitly defined constructor in a class.
A constructor can be declared private. TRUE
This feature is used for implementing Singleton Classes.
A constructor can declare a return value. FALSE
A constructor must initialize all the member variables of a class. FALSE
All non-final instance variables get default values if not explicitly initialized.
A constructor can access the non-static members of a class. TRUE
A constructor is non-static, and so it can access directly both the static and non-static members of the class.


Constructors need not necessarily initialize all or any of the member variables of the class. A non-final member variable will be assigned a default value if not explicitly initialized.
 */

/*
Which of the following can be used as a constructor for the class shell given below?

public class TestClass
{
   // lots of code ...
}
Answered Correctly

You had to select 2 option(s)
public void TestClass() {...} // NOT VALID
There should be no return type. Not even void.
public TestClass() {...} // VALID CONSTRUCTOR
public static TestClass() {...} // NOT VALID
Constructors cannot be static.
public final TestClass() {...} // NOT VALID
Constructors cannot be final.
public TestClass(int x) { ...} // VALID CONSTRUCTOR


Unlike methods, a constructor cannot be abstract, static, final, native, or synchronized.
A constructor is not inherited, so, there is no need to declare it final and an abstract constructor could never be implemented.
A constructor is always invoked with respect to an object, so, it makes no sense for a constructor to be static.
There is no practical need for a constructor to be synchronized, because it would lock the object under construction,
which is normally not made available to other threads until all constructors for the object have completed their work.
The lack of native constructors is an arbitrary language design choice that makes it easy for an implementation of the
Java Virtual Machine to verify that superclass constructors are always properly invoked during object creation.
 */