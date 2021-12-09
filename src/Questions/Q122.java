package Questions;

public class Q122 {
    public static void main(String[] args) {

        Short s1 = 200;
        Integer s2 = 400;
//        String s3 = (String) (s1 + s2); // line n1
        Long s4 = (long) s1 + s2;  // line n2
        System.out.println("Sum is " + s4);
    }
}

/*

What is the result?
A. Sum is 600
B. Compilation fails at line n1
C. Compilation fails at line n2
D. A ClassCastException is thrown at line n1

 */

// Answer is B

/*
Explanation:

Casting only happens between:
1. primitive data types which represent numbers (byte, short, int, long, float, double);
2. wrapper classes and corresponding primitive data types (ex: Long -> long, Byte -> byte);
3. classes that have "is a" relationship (inheritance);

 */
