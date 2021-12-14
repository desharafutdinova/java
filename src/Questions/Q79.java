package Questions;

class C2 {

    public C2(){
        System.out.println("C");
    }
}

class B2 extends C2{

    public B2(){
        System.out.println("B");
    }
}

class A2 extends B2{

    public A2(){
        System.out.println("A");
    }
}

public class Q79 {
    public static void main(String[] args) {

        A2 a = new A2();
    }
}

/*

What is the result?
A. C B A
B. C
C. A B C
D. Compilation fails at line n1 and line n2

 */
