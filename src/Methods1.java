
class Node{
    static final int TYPE = 100;
    public static void print(){
        System.out.println(TYPE); //1
//        System.out.println(Node.TYPE); //1 // this works also
    }
}

public class Methods1{
    public static void main(String[] args) {
//        Node.print(); // this works
//        new Node().print(); // this works but is bad coding practice to call a static method from and instance
//        new Node.print(); // this does not compile
        //Observe the missing brackets after Node. "new Node" is syntactically incorrect and will not compile.
//        Node().print(); // this does not compile
        // Node() is the syntax for calling a method named Node. But there is no Node() method in class Test.
//        print();
        // print method is in the Node class. It is not directly accessible in the Test class. Therefore, Node.print(); is required.
    }
}
