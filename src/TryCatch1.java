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
