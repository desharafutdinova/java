package Questions;

import com.sun.xml.internal.bind.util.Which;

public class Q84 {
    public static void main(String[] args) {

        // Which two array initialization statements are valid? (Choose two.)
        // A
//        int array[] = new int[3] {1, 2, 3};

        // B
        int array1[] = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        // C
//        int array2[3] = new int[] {1, 2, 3};

        // D
//        int array3[] = new int[3]; array = {1, 2, 3};

        // E
        int array4[] = new int[] {1,2,3};
    }
}
