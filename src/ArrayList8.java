public class ArrayList8 {

    public static void main(String[] args) {
//        String[] sA = new String[1] { "aaa"};
//        Array size cannot be given here as the array in being initialized in the declaration.
        String[] sB = new String[] { "aaa"};
        String[] sC = new String[1] ; sC[0] = "aaa";
        String[] sD = {new String( "aaa")};
        String[] sE = { "aaa"};

// You can't tell the array twice how long it is

//        System.out.println(sA[0);
        System.out.println(sB[0]);
        System.out.println(sC[0]);
        System.out.println(sD[0]);
        System.out.println(sE[0]);
    }
}
