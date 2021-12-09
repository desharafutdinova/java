package Questions;

public class Q126 {
    public static void main(String[] args) {

        int array[] = {10, 20, 30, 40, 50};
        int x = array.length;

        // line 1

        // A
        while(x > 0){
            x--;
            System.out.println(array[x]);}

        // B
        do{
            x--;
            System.out.println(array[x]);
        } while (x >= 0);

        // C
        while (x >= 0){
            System.out.println(array[x]);
            x--;}

        // D
        do{
            System.out.println(array[x]);
            --x;
        } while (x >= 0);

        // E
        while (x > 0){
            System.out.println(array[--x]);
        }
    }
}


/*

Which two code fragments can be independently inserted at line n1 to enable the code to print the elements of the array in reverse order? (Choose two.)
A
B
C
D
E

 */

// Answer is

/**
 * TODO
 */
