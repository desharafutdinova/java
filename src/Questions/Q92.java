package Questions;

public class Q92 {
    public static void main(String[] args) {

        byte x = 1;
//        short x = 1;
//        String x = "1";
//        long x = 1;
//        double x = 1;
//        Integer x = new Integer("1");

        //line 1
        switch (x){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }
}

/*

Which three code fragments can be independently inserted at line n1 to enable the code to print One?
(Choose three.)
A. byte x = 1;
B. short x = 1;
C. String x = "1";
D. long x = 1;
E. double x = 1;
F. Integer x = new Integer("1");

 */

/*
Explanation: switch only accepts byte, short, int, char, String, Byte, Short, Integer

Option F. Integer x = new Integer("1"); is valid because Integer constructor is overloaded, and you can add either int or String (which will be parsed into int)
 */



// Answer is A, B, F
