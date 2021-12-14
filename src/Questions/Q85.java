package Questions;

class MyException1 extends RuntimeException {}

public class Q85 {
    public static void main(String[] args) {

        try {
            method1();
        }
        catch(MyException1 ne) {
            System.out.println("A");
        }
    }

    public static void method1 (){ // line n1
        try{
            throw Math.random() > 0.5 ? new MyException1() : new RuntimeException();
        }
        catch (RuntimeException re){
            System.out.println("B");
        }
    }
}


/*

What is the result?
A. A
B. B
C. Either A or B
D. A B
E. A compile time error occurs at line n1

 */

/*

Explanation:


 */

// Answer is