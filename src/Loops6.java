public class Loops6
{
    public static void main(String[] args)
    {
        fort : for(int i = 0; i< 10; i++)
    {
        for (int j = 0; j< 10; j++)
        {
            if ( i+ j > 10 )  break fort;
        }
        System.out.println( "hello");
        System.out.println("i: " + i);
    }
    }
}
