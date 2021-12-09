package Questions.Q91;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        // Option A
        ArrayList<Animal> myList1 = new ArrayList<>();
        myList1.add( new Tiger());

        // Option B
        ArrayList<Hunter> myList2 = new ArrayList<>();
        myList2.add( new Cat());

        // Option C
        ArrayList<Hunter> myList3 = new ArrayList<>();
        myList3.add( new Tiger());

        // Option D
        ArrayList<Tiger> myList4 = new ArrayList<>();
        //myList4.add( new Cat());

        // Option E
        ArrayList<Animal> myList5 = new ArrayList<>();
        myList5.add( new Cat());

    }
}

/*

Which answer fails to compile?
A. Option A
B. Option B
C. Option C
D. Option D
E. Option E

 */


// Answer is D
