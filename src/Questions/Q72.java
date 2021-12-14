package Questions;

class Test3 {
    public static void main(String[] args) {

        Test3 ts = new Test3 ();
        System.out.println(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.println(isAvailable);
    }

    public static boolean doStuff(){
        return !isAvailable;
    }

    static boolean isAvailable = false;
}

/*

What is the result?
A. Compilation fails.
B. false true
C. true false
D. true true
E. false false

 */



