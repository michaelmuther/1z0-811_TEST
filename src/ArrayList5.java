public class ArrayList5 {

    public void initData(String[] arr){
        int ind = 0;
        for(String str : arr){
            str.concat(str+" "+ind);
            ind++;
        }
    }

    public void printData(String[] arr){
        for(String str : arr){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        ArrayList5 ot = new ArrayList5();
        String[] arr = new String[2];
        ot.initData(arr);
        ot.printData(arr);

//        String test = null;
//        String test2 = "test2";
//        String test3 = test + test2;
//        System.out.println(test3); // prints nulltest2

    }
}
/*
When you do new String[2], you create a String array of two elements. arr is therefore not null.
But each element of the array is not given any value and is therefore null.
When you call a method on that element (i.e. str.concat(str+" "+ind); in initData),
it will generate a NullPointerException, which is a RuntimeException.
 */