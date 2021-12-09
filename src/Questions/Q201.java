package Questions;

class Student {

    String name;
    public Student (String name){
        this.name = name;
    }

}

public class Q201 {
    public static void main(String[] args) {
        Student [] students = new Student[3];
        students [1] = new Student("Richard");
        students [2] = new Student("Donald");

        for( Student s : students) {
            System.out.println("" + s.name);
        }
    }
}

/*

What is the result?
A. nullRichardDonald
B. RichardDonald
C. Compilation fails.
D. An ArrayIndexOutOfBoundsException is thrown at runtime.
E. A NullPointerException is thrown at runtime.

 */

/*

Explanation:
If we had to string method  in a Student class with reference to the name variable, then our print statement would be "nullRichardDonald". Because the default value of the element is null. If the element was never added to the array we will not even try to reach it, we will be referred straight to the default value.
But we are trying to reach name variable through object straight in the loop. Since the object of the first element was never created, but we are trying to refer to the instance variable through it, it throws NullPointerException. Because the copy of the instance variable for the non-existing object also doesn't exist.

 */

// Answer is E

