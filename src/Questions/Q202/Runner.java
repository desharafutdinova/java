package Questions.Q202;

public class Runner {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee director = new Director();

        // line 1

        // A
//        director.stockOptions = 1_000;

        // B
        employee.salary = 50_000;

        // C
//        manager.budget = 1_000_000;

        // D
//        manager.stockOption = 500;

        // E
//        employee.budget = 200_000;

        // F
        director.salary = 80_000;


    }
}

/*

Which two options compile when placed at line n1 of the main method? (Choose two.)
A.
B.
C.
D.

 */

/*

Explanation:
Since all the signatures for all object is Employee Class, we will be able to access variable only from the Employee class, which is salary.

Rules of polymorphism: we only have access to methods and variable of the signature class. If the method is overridden in the object class, java will always call a method from the object's side

 */

// Answer is B, F

