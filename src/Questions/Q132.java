package Questions;

public class Q132 {
    public static void main(String[] args) {

        int [][] arr = new int [2][4]; // if the datatype is Integer the resukt is the same
        arr[0] = new int [] {1, 3, 5, 7};
        arr[1] = new int [] {1, 3};

        for( int [] a : arr){
            for( int i : a){
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }
}

/*

What is the result?
A. Compilation fails.
B. 1 3
   1 3
C. 1 3
   followed by an ArrayIndexOutOfBoundException
D. 1 3
   1 3 0 0
E. 1 3 5 7
   1 3

 */

/*

Explanation:

if we declare the second array this way, it will print {1, 3, 0, 0}
 arr[1] = new int [4];
        arr[1][0] = 1;
        arr[1][1] = 3;


 */

// Answer is
