package Questions;


class Caller1{

    private void init(){
        System.out.println("Initialized");
    }

    private void start(){
        init();
        System.out.println("Started");
    }
}

public class Q67 {
    public static void main(String[] args) {

        Caller1 c = new Caller1 ();
//        c.start();
//        c.init();
    }
}


/*

What is the result?
A. An exception is thrown at runtime.
B. InitializedStartedInitialized
C. InitializedStarted
D. Compilation fails.

 */
