package Questions;

public class Q220 {
    public static void main(String[] args) {

        System.out.println("String main " + args[0]);
    }
}
// In command line
// javac Q220.java
// java Q220 "1 2 3"


/*

What is the result?
A. String main 1
B. An exception is thrown at runtime C. String main 1 2 3
D. String main 123

 */

/*

Explanation:
To check how it work on Mac:
create a Q220 java file with the Q220 class info inside
save it on the Desktop
open Terminal
enter command "cd Desktop"
enter command "javac Q220.java" (when it compiles, Q220.class file appears on the Desktop)
enter command "java Q220 "1 2 3""

 */