package Questions;

public class Q197 {

}

/*

Which three statements are true about the structure of a Java class? (Choose three.)
A. A public class must have a main method.
B. A class can have only one private constructors.
C. A method can have the same name as a field.
D. A class can have overloaded static methods.
E. The methods are mandatory components of a class.
F. The fields need not be initialized before use.

 */

/*

Explanation:
A is wrong, because object in java are reusable. object can be shared between two references, passed to another variable etc.
B is wrong because class can have any amount of constructors and all of them can have any existing access modifiers
C is correct, because field and method are called in a different way, so there will never be a mixup
D is correct because static method just like regular once can be overloaded with different parameters. Static method cannot be overridden, but can be overloaded.
E is wrong because methods are optional for classes
D is wrong because fields are instance variables which have default values (unlike local variables), so they can be used without initialization.

 */

// Answer is C, D
