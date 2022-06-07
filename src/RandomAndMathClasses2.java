public class RandomAndMathClasses2 {
}
/*
What can be inserted at //1 and //2 in the code below so that it will print a number between 0.0 and 1.0?
(Assume that no package has been imported in the code.)

       //1
       double d = //2
       System.out.println(d);
Answered Incorrectly

You had to select 2 option(s)
java.util.Random r = new java.util.Random();
and
r.random();
Random r = new Random();
and
r.random();
java.util.Random r = new java.util.Random();
and
r.nextDouble();
Random r = new Random();
and
r.next();
java.util.Random r = new java.util.Random(100);
and
r.nextDouble();
Random r = new Random(100);
and
r.getDouble();


1. Random class is in java.util package.

2. To generate random numbers using Random class, you need to first create an instance of Random class using its no-args or Random(long seed) constructor.

3. You can then invoke any of the nextXXX methods (such as nextInt, nextDouble, nextBoolean, and so on) on the Random instance to get the next random number.

Please go through the JavaDoc API description of this class.
 */