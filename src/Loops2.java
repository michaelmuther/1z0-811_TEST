public class Loops2 {
    public static void main(String[] args) throws Exception {
        String[] sa = {"a", "b", "c"};
        for(String s :  sa){
            if("b".equals(s)) continue;
            System.out.println(s);
            if("b".equals(s)) break;
            System.out.println(s+" again");
        }
    }
}

/*
To determine the output you have to run through the loop one iteration at a time in your mind:

Iteration 1: s is a. It is not equal to b so, it will print a, and then a again.
Iteration 2: s is b. It is equal to b, so the first if will execute continue;, which means the rest of the code in the loop will not be executed (thus b and b again will not be printed), and the next iteration will start. Note that the second if is not executed at all because of the continue in the first if.
Iteration 3: s is c, both the if conditions are not satisfied. So, c and c again will be printed.
 */