package Questions;

public class Q217 {
    public static void main(String[] args) {

        String s = "Java SE 8 1";
        int len = s.trim().length();
        System.out.println(len);
    }
}

/*

What is the result?
A. Compilation fails.
B. 11
C. 8
D. 9
E. 10

 */

/*

Explanation:
trim() methods only removes spaces from the beginning and the end.
length() method return the amount of chars the String consists of. The count starts from 1, not from 0 like you do for indexes.

 */

// Answer is B
