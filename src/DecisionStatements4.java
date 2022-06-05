public class DecisionStatements4
{
    public static void main(String args[])
    {
        char i;
// 1. Defining i as char doesn't mean that it can only hold characters (a, b, c etc).
// char is an integral data type which can take any positive integer value from 0 to 2^16 -1.
        LOOP: for (i=0;i<5;i++)
        {
            switch(i++)
            {
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break LOOP;
                case 2: System.out.println("C"); break;
                case 3: System.out.println("D"); break;
                case 4: System.out.println("E");
                case 'E' : System.out.println("F");
            }
/*
2. integer 0 or 1, 2 etc. is not same as char '0', '1' or '2' etc.
So, when i is equal to 0, nothing gets printed and i is incremented to 1 (due to i++ in the switch).
i is then incremented again by the for loop for next iteration. so i becomes 2.
when i = 2, "C" is printed and i is incremented to 3 (due to i++ in the switch) and then i is incremented to 4 by the for loop so i becomes 4.
when i = 4, "E" is printed and since there is no break, it falls through to case '5' and "F" is printed.
i is incremented to 5 and the for loop ends.
 */
        }
    }
}
