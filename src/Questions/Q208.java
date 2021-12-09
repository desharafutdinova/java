package Questions;

class Caller {

    private void init () {
        System.out.println("Initialized");
    }

    private void start () {
        init();
        System.out.println("Started");
    }
}

public class Q208 {
    public static void main(String[] args) {

        Caller c = new Caller ();
//        c.start(); // line n1
//        c.init(); // line n2
    }
}

/*

What is the result?
A. Compilation fails at line n1.
B. InitializedStartedInitialized
C. InitializedStarted
D. Compilation fails at line n2.
E. Compilation fails at line n1 and n2

 */

/*

Explanation:
Since access modifiers of both methods are private, that means we cannot access the methods outside the Caller class. So compilation will fail on both lines.

 */