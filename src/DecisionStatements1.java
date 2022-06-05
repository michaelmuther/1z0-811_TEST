public class DecisionStatements1 {
    public static void main(String[] args) {
        boolean flag = true;
        if(flag = false){ // this evaluates to false and reassigns flag to false
            System.out.println("1");
        }else if(flag){ // flag is now false; code not executed here
            System.out.println("2");
        }else if(!flag){ // this is executed as flag is now false
            System.out.println("3"); // 3 is printed
        }else System.out.println("4"); // code does not run here
    }
}
