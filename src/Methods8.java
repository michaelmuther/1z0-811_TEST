public class Methods8 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.abstractMethod());
    }
}

abstract class A {
    public abstract String abstractMethod();
}

class B extends A{
    @Override
    public String abstractMethod() {
        return "Abstract Method";
    }
}

/*
An abstract method is a method that is declared in a class without providing
an implementation (no braces, followed by a semicolon).  Only abstract classes
can contain abstract methods.  A class containing abstract methods should also
be declared abstract.
 */