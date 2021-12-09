package Questions;

public class Q213 {
}

abstract class Toy {

    int price;

    // line n1;

    // A
    public static void insertToy() {
        /* code goes here */
    }

    // B
//    final Toy getToy() {
//        return new Toy();
//    }

    // C
//    public void printToy();

    // D
    public int calculatePrice(){
        return price;
    }

    // E
    public abstract int computeDiscount();

}

/*

Which three code fragments are valid at line n1?
A.
B.
C.
D.
E.

 */

/*

Explanation:
A is correct because abstract class is allowed to have non-abstract (instance and static) methods with implementation.
B is incorrect because abstract class cannot have an object, so we cannot use it as return type.
C is wrong because the regular method has to have implementation ALWAYS.
D is true for the same reasons as described in B
E is correct because it's a regular abstract class without implementation inside an abstract class.

 */

// Answer is A, D, E
