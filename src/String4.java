public class String4 {
    public static void main(String[] args) {
        String a = "aAaA", b = "bbBB";

        if(a.endsWith("aa") || b.startsWith("BB")) System.out.println("YES1");
// Both - startsWith and endsWith methods are case-sensitive.
// So aA is not considered as a match to aa and bb is not considered as a match to BB.
// Thus, the expression returns false.
        if( (a.substring(1,2) + b.substring(2)).startsWith("AB") ) System.out.println("YES2");
//a.substring(1,2) gives you "A"
//b.substring(2) gives you "BB"
//+ operator appends the two to give: ABB, which starts with AB. So, it prints YES.
        if(a.length() == b.replace('x', 'y').length()) System.out.println("YES3");
//a.length() is 4
//b.replace('x', 'y') returns the same String "bbBB", which is also of length 4.
// So, YES is printed.
        if( (a+b).charAt(4) != b.charAt(0)) System.out.println("YES4");
//a+b will give you aAaAbbBB
//(a+b).charAt(4) will give you b (remember that indexing starts from 0)
//b.charAt(0) will also give you b.
//Since both are same and the condition is != (NOT EQUAL TO), YES is not printed.
    }
}
