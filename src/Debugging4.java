public class Debugging4
{
    public static void main(String[] args)
    {
        int j = 1;
        try
        {
            int i = doIt() / (j = 2);
        } catch (Exception e)
        {
            System.out.println(" j = " + j);
        }
    }
    public static int doIt() throws Exception {  throw new Exception("FORGET IT");  }
}
/*

If evaluation of the left-hand operand of a binary operator completes abruptly, no part of the right-hand operand appears to have been evaluated.
In the given code, as soon as doIt() throws exception, the statement execution is aborted. Therefore, the rest of the expression (i.e. j = 2) never gets executed.

 */