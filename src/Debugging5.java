public class Debugging5 {
    public static void main(String args[]) {
        try {
            int nos[] = new int[2];
            nos[5] = 100;
            System.err.println(nos[5]);
        }
        catch (Exception e) {
//            e.printStackTrace();
        }
//        catch (ArrayIndexOutOfBoundsException e) {
////            e.printStackTrace();
//        }
    }
}

/*
The more specific catch must be before the less specific:
The code will not even compile if this is not the case.
 */
