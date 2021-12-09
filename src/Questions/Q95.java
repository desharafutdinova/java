package Questions;

import java.util.ArrayList;
import java.util.List;

class Product1{
    int id;
    String name;
    Product1 (int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class Q95 /* Shop */{
    public static void main(String[] args) {

        // in original file the name of the object was 1st, which is wrong, because the name cannot be started with a number
        // seems like it's not related to the question and answer
        List<Product> first = new ArrayList<>();
        first.add (new Product(10, "IceCream"));
        first.add (new Product(10, "Chocolate"));
        Product1 p1 = new Product1(10, "IceCream");
        System.out.println(first.indexOf(p1));

    }
}

/*

What is the result?
A. true
B. false
C. -1
D. 0

 */

// Answer is C
