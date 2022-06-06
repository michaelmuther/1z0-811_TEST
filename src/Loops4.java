public class Loops4
{
    public static void main(String args[])
    {
        int counter = 0;
        outer: for(int i = 0; i < 3; i++)
            middle: for(int j = 0; j < 3; j++)
                inner: for(int k = 0; k < 3; k++)
                {
                    if(k-j>0) break middle; // breaks middle loop and returns control to outer loop
                    counter++;
                }
        System.out.println(counter);
    }
}

/*
The key is that the middle loop is broken as soon as k-j becomes > 0.
This happens on every second iteration of inner loop when k is 1 and j is 0.
Now, when middle is broken inner cannot continue.
So the next iteration of outer starts.
 */
