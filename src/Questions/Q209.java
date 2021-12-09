package Questions;

public class Q209 {
}

class Test1 {

    int x, y;

    public Test1 (int x, int y){
        initialize (x, y);
    }

    public void initialize (int x, int y){
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {

        int x= 9, y = 5;
        Test1 obj = new Test1 (x, y);
        System.out.println(x + " " + y);
    }
}

/*

What is the result?
A. 9 5
B. 81 25
C. Compilation fails.
D. 0 0

 */

/*

Explanation:

 */

// Answer is

