package Questions;

import java.util.ArrayList;
import java.util.List;

class Patient {
    String name;
    public Patient (String name){
        this.name = name;
    }
}

public class Q200 {
    public static void main(String[] args) {

        List ps = new ArrayList();
        Patient p2 = new Patient ("Mike");
        ps.add (p2);

        // insert code here

        // A
//        int f = ps.indexOf(p2);

        // B
//        int f = ps.indexOf(Patient ("Mike"));

        // C
//        int f = ps.indexOf(new Patient ("Mike"));

        // C
        Patient p = new Patient ("Mike");
        int f = ps.indexOf(p);

        if (f >= 0){
            System.out.println("Mike Found");
        }
    }
}

/*

Which three statements are true about the structure of a Java class? (Choose three.)
A.
B.
C.
D.

 */

/*

Explanation:

 */

/**
 * TODO
 * write an explanation for this question
 */

// Answer is A
