package Questions;

import java.util.ArrayList;
import java.util.List;

public class Q221 {
    public static void main(String[] args) {

        List colors = new ArrayList();

        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3, "cyan"); // this method only works with indexes which exist or with index which is the next after the last one (it should be equal to the size of list)

        System.out.println(colors);

    }
}

/*

What is the result?
A. [green, red, yellow, cyan]
B. [green, blue, yellow, cyan]
C. [green, red, cyan, yellow]
D. An IndexOutOfBoundsException is thrown at runtime.

 */

// Answer is B

/*



 */
