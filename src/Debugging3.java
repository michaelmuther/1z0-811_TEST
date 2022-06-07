public class Debugging3
{
    public String checkIt(String s)
    {
        if(s.length() == 0 || s == null)
//        if(s == null || s.length() == 0)
        {
            return "EMPTY";
        }
        else return "NOT EMPTY";
    }

    public static void main(String[] args)
    {
        Debugging3 a = new Debugging3();
        System.out.println(a.checkIt(null));
    }

}
/*
It will print EMPTY. FALSE
It will print NOT EMPTY. FALSE
It will throw NullPointerException. TRUE
Because the first part of the expression (s.length() == 0) is trying to call a method on s, which is null. The check s == null should be done before calling a method on the reference.
It will print EMPTY if || is replaced with |. FALSE
In this case, replacing || with | will not make any difference because s.length() will anyway be called before checking whether s is null or not. The right expression would be:
if( s == null || s.length() == 0) { ... }
In this case, || being a short circuit expression, s.length() == 0 will not be called if s == null returns true. Hence, no NullPointerExpression will be thrown.
 */