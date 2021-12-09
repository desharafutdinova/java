package Questions.Q100.package2;

import Questions.Q100.package1.Acc;

public class Test extends Acc {
    public static void main(String[] args) {

        Acc obj = new Test();

//        System.out.println(obj.p);
//        System.out.println(obj.q);
//        System.out.println(obj.r);
        System.out.println(obj.s);

    }
}

/*

Which statement is true?
A. Both p and s are accessible via obj
B. Only s is accessible via obj
C. Both r and s are accessible via obj
D. p, r, and s are accessible via obj

 */

/*
Explanation:

We only can access protected INSTANCE variable if:
- inheritance exists;
- it's called in non-static methods (cannot be reach in the main method);
- it's called just by "variableName", not with the "objectName.variableName";
- we cannot reassign/change it in the child class, only pass the value or print;

 We only can access protected STATIC variable if:
- inheritance exists;
- it can be reached in both static & non-static methods;
- it's called either by "variableName", or "className.variableName";
- we cannot reassign/change it in the child class, only pass the value or print;
 */


// Answer is B
