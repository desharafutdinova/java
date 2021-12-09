package Questions;

import com.sun.tools.javac.resources.javac;

public class Q121 {
    public static void main(int[] args) {

        System.out.println("int main " + args[0]);
    }

    public static void main(Object[] args) {

        System.out.println("Object main " + args[0]);
    }

    public static void main(String [] args) {

        System.out.println("String main " + args[0]);
    }

//    javac Q121.java;
//    java Q121 1 2 3;

}

/*

What is the result?
A. int main 1
B. Object main 1
C. String main 1
D. Compilation fails
E. An exception is thrown at runtime

 */
