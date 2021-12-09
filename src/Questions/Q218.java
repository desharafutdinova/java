package Questions;

import java.util.Locale;

public class Q218 {
    public static void main(String[] args) {

        String  str1 = "Java";
        String str2 = new String ("java");
        // line 1
        // A
        str1.toLowerCase();
        if (str1 == str2)

        // B
        if (str2.equals(str1.toLowerCase()))

        // C
        str1.toLowerCase();
        if (str1.equals(str1.toLowerCase()))

        // D
        if (str1.toLowerCase() == str2.toLowerCase())

        { System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

/*

Which code fragment, when inserted at line n1, enables the App class to print Equal?
A.
B.
C.
D.

 */

/*

Explanation:
== is always comparing memory location of the value. One of the Strings is literal and is located in the String pool and the second one is an object and located in the different place in the Heap. Any option with == will print "not Equal". In option C when toLowerCase methos is called the first time, it doesn't affect the string because it's immutable, so we compare "Java" with "java".

 */

// Answer is B
