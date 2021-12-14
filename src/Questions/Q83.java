package Questions;

public class Q83 {
}

class Test5 {
    public static void main(String[] args) {

        Test5 ts = new Test5();

        System.out.println(isAvailable + " ");

        isAvailable = ts.doStuff();

        System.out.println(isAvailable);
    }

    public static boolean doStuff(){
        return !isAvailable;
    }

    static boolean isAvailable = true;
}

/*

What is the result?
A. Compilation fails.
B. false true
C. true false
D. true true E. false false

 */

/*

Explanation:


 */

// Answer is
