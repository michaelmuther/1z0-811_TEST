public class DataTypes2
{
    static int si = 10;
    int  i;
//    final boolean bool; // this never gets initialized.  The answer is none.
    // 1
//    instance { bool = true; }
    //You cannot put the word instance here. It is not a keyword.
//    InitTest() { si += 10; }
    //It is a constructor, but it does not initialize the final variable bool.
//    void InitTest(){ si = 5; i = bool ? 1000 : 2000;}
    //Observe the presence of a return type. It is not a constructor.
    //It is a valid method but the statement i = bool ? 1000 : 2000;
    // is invalid because you cannot use the variable bool before initializing it!
//    { i = 1000; }
    //bool remains uninitialized.
//    InitTest() { si += 10; }
//    InitTest(boolean flag) { bool  = flag; }
    //A final instance variable must be initialized in every constructor.
    // It is left uninitized in the first constructor here.
}
/*
A final variable must be initialized when an instance is constructed, or else the code will not compile.
This can be done either in any of the instance initializers (if present in a class)  or in EVERY constructor.

The exam objectives do not mention instance or static initializers.
But it would be good to read about them a little bit because the objectives explicitly mention final variables.
 */