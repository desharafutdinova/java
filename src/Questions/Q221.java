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
        colors.add(3, "cyan");

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

/*

Explanation:
add(String) method add element to the end of the ArrayList.
remove(int) remove element from the position with the index which was put as a parameter.
add(int, String) method only works with indexes which exist in ArrayList or with index which is the next after the last one (it should be equal to the size of list)

 */

// Answer is B

