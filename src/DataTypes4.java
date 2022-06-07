public class DataTypes4 {

    public static void main(String[] args) {
        int rate = 10;
//        int amount = 1 - rate/100*1 - rate/100;
//        long amount = 1 - rate/100*1 - rate/100;
//        float amount = 1 - rate/100*1 - rate/100;
        double amount = 1 - rate/100*1 - rate/100;
        System.out.println(amount);
    }
}

/*
Note that none of the terms in the expression 1 - rate/100*1 - r/100; is double or float.
They are all ints. So the result of the expression will be an int.
Since, an int value can be assigned to a variable of type int, long, float, and double, the type of amount can be int, long, float or double.
 */
