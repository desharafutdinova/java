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
cannot return an object of an abstract class

 */

// Answer is A, D, E
