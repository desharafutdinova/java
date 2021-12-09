package Questions;

public class Q214 {

    public static final int MIN = 1;

    public static void main(String[] args) {

        int x = args.length;
        if(checkLimit (x)){  // line n1
            System.out.println("Java SE");
        }
        else{
            System.out.println("Java EE");
        }
    }

    public static boolean checkLimit (int x){
        return (x >= MIN) ? true : false;
    }
}

// javac Q214.java
// java Q214 1

/*

What is the result?
A. Java SE
B. Java EE
C. Compilation fails at line n1.
D. A NullPointerException is thrown at runtime.

 */

/*

Explanation:

 */

// Answer is A
