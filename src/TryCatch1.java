public class TryCatch1
{

    public static void main(String args[])
    {
        try
        {
            if (args.length == 0) return; // this is true if no arguments are entered
            else throw new Exception("Some Exception");
        }
        catch(Exception e)
        {
            System.out.println("Exception in Main");
        }
        finally
        {
            System.out.println("The end"); // finally runs in any event, even if no exception is thrown in the try block
        }
    }
}

// with one or more arguments it will print "Exception in Main" and "The end".
// with no arguments it will print "The end"

/*
There are two points to understand here:
1. Even if the program is executed without any arguments, the 'args' is NOT NULL. In such case it will be initialized to an arry of Strings containing zero elements.
2. The finally block is always executed, no matter how control leaves the try block. Only if, in a try or catch block, System.exit() is called then finally will not be executed.
 */
