public class DecisionStatement10
{
    public static void main(String args[])
    {
        int k = 9, s = 5;
        switch(k)
        {
            default :
                if( k == 10) { s = s*2; }
                else
                {
                    s = s+4;
                    break;
                }
            case 7 : s = s+3;
        }
        System.out.println(s);
    }
}

/*
Answered Incorrectly

You had to select 1 option(s)
5
9 TRUE
Even though the break is inside the else block here, it will prevent the "fall through" to case 7.
12
It will not compile.
 */