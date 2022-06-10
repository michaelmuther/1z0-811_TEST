public class ArrayList9 {
    public static void main(String[] args) {
        String[] dataArr = new String[4];
//        String[] dataArr;
        dataArr[1] = "Bill";
        dataArr[2] = "Steve";
        dataArr[3] = "Larry";
        try{
//            for(String data : dataArr){
//                System.out.print(data+" ");
//            }
            // same below, not a null pointer exception if null is in the String[]
            for(int i = 0; i < dataArr.length; i++) {
                System.out.print(dataArr[i] + " ");
            }
        }catch(Exception e){
            System.out.println(e.getClass());
        }
    }
}
/*
null Bill Steve Larry
It is not a null point exception when the String array defaults to null in the for loop
 */