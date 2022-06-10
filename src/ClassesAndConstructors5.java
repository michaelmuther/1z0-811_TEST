class ClassesAndConstructors5 {
    int id;
    double balance;

    public ClassesAndConstructors5(int id, double balance){
        this.id = id;
        this.balance =  balance;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
class Account{
    public static void main(String[] args) {

        //INSERT CODE HERE
        //1
//        ClassesAndConstructors5 acct = new ClassesAndConstructors5();
//        acct.id = 10;
//        acct.balance = 10.0;

        //2
        ClassesAndConstructors5 acct = new ClassesAndConstructors5(10, 10);

        System.out.println(acct.id+" "+acct.balance);
    }
}

