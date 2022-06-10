public class ArrayList6 {
    double balance;
    public void update(int[] balances){

//        balances[0] = 100;
//        balances[1] = 100;

//        for (int i = 0; i < balances.length; i++) {
//            balances[i] = 100;
//        }

        for(int bal : balances){
            bal = 100;
        }

    }

    public static void main(String[] args) {
        int[] balances = new int[2];
        balances[0] = 10;
        balances[1] = 20;
        for(int bal :  balances){
            System.out.print(bal+" ");
        }
        ArrayList6 a = new ArrayList6();
        a.update(balances);
        for(int bal :  balances){
            System.out.print(bal+" ");
        }
    }
}

/*
Answered Incorrectly

You had to select 1 option(s)
10 20 100 100 // not this
10 20 10 20 // TRUE
In each iteration of the foreach loop, the value of an array element is assigned to the loop variable.
Therefore, updating the value of the foreach loop variable bal in the update method does not change the values in the array pointed to by balances.
Compilation failure
An exception will be thrown at run time.


Note that Java uses pass by value semantics for passing parameters. Therefore, when you pass the balances variable to the update method,
the value contained in this variable (this value is actually an address to the int array) is passed. This address is copied
to the balances parameter of the update method. Therefore, both - the balances variable of the update method and the balances
variable of the main method - point to the same int array object.
 */