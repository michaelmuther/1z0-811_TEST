public class TryCatch2
{
    public static void main(String args[]) throws Exception
    {
        try
        {
            m1();
            System.out.println("A"); // does not run as M1 throws the exception
            // An exception is thrown in method m1(), therefore the next line after the method call i.e. System.out.println("A"), will not be executed.
        }
//        catch(Exception e)
//        {
//            System.out.println("caught");
//        }
        finally
        {
            System.out.println("B"); // This runs for sure even though exception is not caught
            // A 'finally' block is always executed (even if there is a return statement in the try or catch block, but not if there is a called to System.exit() ), therefore, println("B") will be executed.
        }
        System.out.println("C"); // This does not run as the Exception is not handled.
        // Since there is no catch block, the exception will not be handled and the main() method will propagate the exception up to the JVM without executing the rest of the statements. Therefore, println("C"); will also not be executed.
    }
    public static void m1() throws Exception { throw new Exception(); }
}

// A try statement must always have a ............. associated with it.
// catch, finally or both
// not throw or throws
