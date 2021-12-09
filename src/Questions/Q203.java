package Questions;

public class Q203 {
    public static void main(String[] args) {

        String myStr = "Hello World";
        myStr.trim();

        int i1 = myStr.indexOf(" ");

        System.out.println(i1);
    }
}

/*

What is the result?
A. An exception is thrown at runtime.
B. -1
C. 5
D. 10

 */

/*

Explanation:
Since myStr.trim() was never assign to anything and String is immutable (cannot be changed, only reassigned), this method doesn't remove the last space. However, method indexOf searches for thr first match of the character. And the first place where the space is present is at the position with index 5.

 */

// Answer is C
