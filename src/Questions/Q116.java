package Questions;

class A1 {
    public void test(){
        System.out.println("A");
    }
}

class B1 extends A1 {
    public void test(){
        System.out.println("B");
    }
}

class C1 extends A1 {
    public void test(){
        System.out.println("C");
    }
}

public class Q116 {
    public static void main(String[] args) {
        A1 b1 = new A1();
        A1 b2 = new C1();
        b1 = (A1) b2;  // line n1
        A1 b3 = (B1) b2;  // line n2
        b1.test();
        b3.test();
    }
}

/*

What is the result?
A. AB
B. AC
C. CC
D. A ClassCastException is thrown only at line n1.
E. A ClassCastException is thrown only at line n2.

 */

// Answer is E