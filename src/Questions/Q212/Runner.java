package Questions.Q212;

public class Runner {
    public static void main(String[] args) {

        P1 obj = new P1 ();
        P2 obj2 = new P2 ();
        I1 obj3 = new P2 ();

        boolean r1 = obj instanceof P2;
        boolean r2 = obj2 instanceof P1;
        boolean r3 = obj3 instanceof I1;

        System.out.println(r1 + ":" + r2 + ":" + r3);

    }
}

/*

What is the result?
A. true:false:true
B. false:true:true
C. false:true:false
D. true:true:false

 */

/*

Explanation:
obj is a parent object with a parent reference P1, it cannot be an instance of a child P2;
obj2 is an object of the child with the child reference P2 which extends parent P1. Since there is inheritance obj2 is both instance of P1 and P2. Same logic applies for the implemented Interface.

 */

// Answer is B
