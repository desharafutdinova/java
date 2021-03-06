package Questions.Q198.market;

// insert code here

import Questions.Q198.sales.SalesMan;
import Questions.Q198.sales.products.Product;

public class USMarket {

    SalesMan sm;
    Product p;
}


/*

Which code fragment, when inserted at line 2, enables the code to compile?
A. import sales.*;
B. import java.sales.products.*;
C. import sale;
   import sales.products;
D. import sales.*;
   import products.*;
E. import sales.*;
   import products.*;

 */

/*

Explanation:
When trying to call classes and methods from different packages (even the subpackages) you ALWAYS have to import package.sunpackage.subpackageOfSubpackage...ClassName;
If a method from a class need to be used we also need to add method name in the import line after the ClassName of use a wild card * to import all data from the class right away

 */

// Answer is E
