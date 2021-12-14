package Questions.Q62;

public class EBook extends Book {  // line 3

    public void readBook(){
        System.out.println("Read E-Book");
    }

     public void download(){} // this line should be commented to see the real result

    public static void main(String[] args) {
        Book book1 = new EBook();
        book1.readBook();
    }
}


/*

What is the result?
A. Compilation fails at line n2.
B. Read Book
C. Read E-Book
D. Compilation fails at line n1.
E. Compilation fails at line n3.

 */

/*

Explanation:
Compilation fails on line 3 where the concrete class is declared, because concrete class always has to implement abstract methods from ancestors if those where not implemented before

*/
