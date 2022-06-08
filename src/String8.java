public class String8 {
}
/*
Which of these statements concerning the charAt() method of java.lang.String class are true?
Answered Incorrectly

You had to select 2 option(s)
The charAt( ) method can take a char value as an argument.  TRUE
Yes, it can because it takes an int and char will be implicitly promoted to int.
The charAt( ) method returns a Character object.  FALSE
It returns char.
The expression char ch = "12345".charAt(3) will assign 3 to ch.  FALSE
It will assign 4 as indexing starts from 0.
The expression char ch = str.charAt(str.length()) where str is "12345", will assign 3 to ch. FALSE
It will throw IndexOutOfBoundsException as str.length() is 5 and there is no str.charAt(5);
The index of the first character is 0. TRUE


public char charAt(int index)
Returns the char value at the specified index. An index ranges from 0 to length() - 1. The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
If the char value specified by the index is a surrogate, the surrogate value is returned.


Specified by:
  charAt in interface CharSequence
Parameters:
  index - the index of the char value.
Returns:
  the char value at the specified index of this string. The first char value is at index 0.
Throws:
  IndexOutOfBoundsException - if the index argument is negative or not less than the length of this string.
 */