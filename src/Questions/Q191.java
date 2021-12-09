package Questions;

public class Q191 {
}

class Vowel {

    private char var;

    public static void main (String [] args){
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';

        Vowel obj1 = new Vowel();
        Vowel obj2 = obj1;
        obj1.var = 'o';
        obj2.var = 'i';

        System.out.println(var1 + ", " + var2);
        System.out.println(obj1.var + ", " + obj2.var);
    }

}

/*

What is the result?
A. a, ei, i
B. a, eo, o
C. e, ei, i
D. a, ao, o

 */

/*

Explanation:
var1 and var2 are just local variable which values are printed. Since obj1 and obj2 point

 */

//Answer is A

