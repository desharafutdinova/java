package Questions;

import java.util.Arrays;

public class Q146 {
    public static void main(String[] args) {

        String[] strs = new String[2];

        int idx = 0;

        for(String s : strs){
            strs[idx].concat(" element " + idx); // concat method doesn't work with null, throws NullPointerException
            idx++;
        }


//        for (idx = 0; idx < strs.length; idx++) {
//            System.out.println(strs[idx]);
//        }
    }
}
