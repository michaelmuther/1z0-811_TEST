public class Methods6
{
    public static void main(String[] args){
        new Methods6().sayHello();
//        sayHello();
    }   //1
//    public static void sayHello(){ System.out.println("Static Hello World"); }  //2
    public void sayHello() { System.out.println("Hello World "); }  //3
}

/*
What will be the result of compiling and running the class?
Answered Correctly

You had to select 1 option(s)
It will print 'Hello World'.
It will print 'Static Hello World'.
Compilation error at line 2.
Compilation error at line 3.
The compiler will generate an error saying method sayHello() is already defined.
Runtime Error.


You cannot have two methods with the same signature (name and parameter types) in one class.
Also, even if you put one sayHello() method in other class which is a subclass of this class,
it won't compile because you cannot override/hide a static method with a non static method and vice versa.
 */