package Questions;

import java.util.Arrays;

public class Q127 {
    public static void main(String[] args) {

        char[][] grid = new char[3][3];

        /*  _ stands for empty
        {0, 0, _,}
        {_, X, 0,}
        {X, _, X,}
         */

        grid [0][0] = '0';
        grid [0][1] = '0';
        grid [1][1] = 'X';
        grid [1][2] = '0';
        grid [2][0] = 'X';
        grid [2][2] = 'X';

        grid [2][1] = 'X';

        System.out.println(Arrays.deepToString(grid));


    }
}
