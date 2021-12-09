package Questions;

public class Q219 {

    public static void doSum(Integer x, Integer y){
        System.out.println("Integer sum is " + (x+y));
    }
    public static void doSum(double x, double y){
        System.out.println("double sum is " + (x+y));
    }
    public static void doSum(float x, float y){
        System.out.println("float sum is " + (x+y));
    }

    public static void main(String[] args) {
        doSum(10, 20);
        doSum(10.0, 20.0);
    }
}

/*

What is the result?
A. float sum is 30.0
   double sum is 30.0
B. double sum is 30.0
   float sum is 30.0
C. Integer sum is 30.0
   double sum is 30.0
D. Integer sum is 30.0
   float sum is 30.0

 */

/*

Explanation:

from smaller to bigger:
byte
short
int
long
float
double

10 and 20 are ints (because whole numbers are ints by default in java if not specified), since method doesn't have int parameters available, java uses the next available datatype, which is float.
10.0 and 20.0  are double, because decimal numbers are double by default in java, if not specified

 */

// Answer is A
