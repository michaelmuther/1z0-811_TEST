public class Methods3
{
    public int methodA(int a){  return a*2; } //1
//    public long methodA(int a){  return a; } //2
    public static void main(String[] args)
    {
        int i = 0;
        i = new Methods3().methodA(2);
        System.out.println( i );
    }
}
/*
Method signature of a method comprises the method name and the ordered list of input parameter types.
The return type, the names of the parameters, and the throws clause (if present) are not considered in determinining the method signature.
Now, if a class has more than one method with the same method name but different signatures,
then that method is said to be overloaded.

You cannot have two methods having the same signature in the same class because then the compiler will not be able to decide which method to call when it finds an invocation of that method.

So, in the code given in this question, the two methods have the same signature, which is illegal. Thus, the code will not compile.
 */