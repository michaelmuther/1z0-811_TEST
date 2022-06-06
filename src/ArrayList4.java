public class ArrayList4 {

    public static void main(String[] args) {
        int a = 1;
        int[] ia = new int[10];
        int b = ia[a];
        int c = b + a;
        System.out.println(b = c);
    }
}

/*
1. All the elements of an array of primitives are automatically initialized by default values,
which is 0 for numeric types and false for boolean.
Therefore, ia[1] is 0.
2. = is not same as ==. The statement b = c assigns c (whose value is 1) to b. which is then printed.
 */

