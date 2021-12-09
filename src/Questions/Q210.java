package Questions;

import java.util.function.Predicate;

public class Q210 {
    public static void main(String[] args) {

        Predicate<Integer> p = (n) -> n%2 == 0;

        // insert code here

        // A
//        Boolean s = p.apply(101);
//        System.out.println(s);

        // B
        Boolean s1 = p.test(100);
        System.out.println(s1);

        // C
//        Integer s2 = p.test(100); // test method returns boolean
//        if (s2 == 1) {
//            System.out.println("false");
//        } else {
//            System.out.println("true");
//        }

        // D
//        System.out.println(p.apply(100));
    }
}

/*

What is the result that will print "true"?
A.
B.
C.
D.

 */

/*

Explanation:
tbd Predicate class doesn't have "apply" method

 */

// Answer is B
