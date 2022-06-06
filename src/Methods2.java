public class Methods2
{
    int value = 1;
    Methods2 link;
    public Methods2(int val){ this.value = val; }
    public static void main(String[] args)
    {
        Methods2 a = new Methods2(5);
        Methods2 b = new Methods2(10);
        a.link = b;
        setIt(a, b);
        System.out.println(a.link.value+", "+b.link.value);
    }

    public static void setIt(Methods2 x, Methods2 y)
    {
        y.link = x;
    }
}
/*
The statement a.link = b; is straight forward. It sets the link field of the Holder object pointed to by the variable a to the Holder object pointed to by the variable b.

When setIf(a, b) is called, the references to the objects referred to by a and b are passed to the setIt method. In the setIt method, these reference are called as x and y. Note that x and y are pointing to the same objects as a and b.

In this method, y.link is set to x. Which effectively sets b.link to a.

Thus 10, 5 is printed.
 */