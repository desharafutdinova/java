package Questions;

import java.io.IOException;

class MyException extends RuntimeException {}

public class Q68 {

    public static void method1(){ // line 1
        try{
            throw 3 > 10 ? new MyException() : new IOException();
        }
        catch (IOException ie){
            System.out.println("I");
        }
        catch (Exception re){
            System.out.println("B");
        }
    }


    public static void main(String[] args) {

        try{
            method1();
        }
        catch (MyException ne){
            System.out.println("A");
        }
    }
}


/*

What is the result?
A. A
B. AB
C. A compile time error occurs at line n1.
D. B
E. I

 */
