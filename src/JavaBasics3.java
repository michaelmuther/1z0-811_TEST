public class JavaBasics3 {
}
/*
Consider the following two java files in /home/user directory:

//file A.java
package com.enthu;
class A
{
}

//file B.java
package com.foo;
class B
{
}


The files are compiled using the following command line:

javac -d /home *.java

Where will the class files be created?
Answered Incorrectly

You had to select 1 option(s)
Both A.class and B.class in /home
A.class in /home/com/enthu and B.class in /home/com/foo // THIS
Both A.class and B.class in /home/classes
No class file will be generated.


The -d option forces the compiler to generate the complete directory structure mimicking the
package name of the class in the directory given after -d in the javac command.
So, A.class will be created in /home/com/enthu and B.class will be created in /home/com/foo
 */
