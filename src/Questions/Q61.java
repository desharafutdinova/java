package Questions;

public class Q61 {
    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5};

        /*
        Given the requirements:
         1. Process all the elements of the array in the reverse order of entry.
         2. Process all the elements of the array in the order of entry.
         3. Process alternating elements of the array in the order of entry.
         */

        for (int i = 0; i < array.length; i++) { // order of entry
            System.out.println(array[i]);
        }

        for (int i = array.length-1; i > 0; i--) { //reversed order
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i+=2) { // alternating
            System.out.println(array[i]);
        }

        for (int each : array){ // order entry
            System.out.println(each);
        }


    }
}

/*

Which two statements are true? (Choose two.)
A. Requirements 1, 2, and 3 can be implemented by using the enhanced for loop.
B. Requirements 1, 2, and 3 can be implemented by using the standard for loop.
C. Requirements 2 and 3 CANNOT be implemented by using the standard for loop.
D. Requirement 2 can be implemented by using the enhanced for loop.
E. Requirement 3 CANNOT be implemented by using either the enhanced for loop or the standard for loop.

 */

/*

Standard loop is a for i loop, which can work with elements inside array in any way, because it uses indexes. Enhanced loop is for each loop which can only go through the elements in the order of entry from 1st to last. It doesn't have any other functions.

 */
