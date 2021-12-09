package Questions;

public class Q216 {
}

class Product3 {
    double price;
}

class Test2 {
    public void updatePrice (Product3 product, double price){
        price = price *2;
        product.price = product.price + price;
    }

    public static void main(String[] args) {

        Product3 prt = new Product3();
        prt.price = 200;
        double newPrice = 100;

        Test2 t = new Test2();
        t.updatePrice (prt, newPrice);

        System.out.println(prt.price + ":" + newPrice);
    }
}

/*

What is the result?
A. 200.0 : 100.0
B. 400.0 : 200.0
C. 400.0 : 100.0
D. Compilation fails.

 */

/*

Explanation:

 */

// Answer is C
