package Questions;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.tools.javac.resources.javac;

public class Q107 {
    public static void main(String[] args) {

        boolean a = new Boolean(Boolean.valueOf(args[0]));
        boolean b = new Boolean(null);
        System.out.println(a + " " + b);


//        And given the commands:
//        javac Q107.java;
//        java Q107 1 null;
    }
}

/*

What is the result?
A. 1 null
B. true false
C. false false
D. true true
E. A ClassCastException is thrown at runtime.

 */

/*
Explanation:
Method Boolean.valueOf() accepts String and returns boolean. It has another method inside called parseBoolean(), which accepts a String and returns true if (String != null) && (String.equals("true")) and false otherwise. The Boolean.valueOf() just returns the same what parseBoolean() method returned.

Boolean() constructor accepts String and executes the same method parseBoolean();
 */
