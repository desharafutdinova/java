package Questions;

class Test4 {

    void readCard (int cardNo) throws Exception {
        System.out.println("Reading Card");
    }

    void checkCard (int cardNo) throws RuntimeException { // line n1
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {

        Test4 ex = new Test4();
        int cardNo = 12344;
//        ex.readCard(cardNo);  // line n2
        ex.checkCard(cardNo);  // line n3
    }
}

/*

What is the result?
A. Reading Card
   Checking Card
B. Compilation fails at line n1.
C. Compilation fails at line n2.
D. Compilation fails at line n3.
E. Compilation fails at both line n2 and line n3.

 */
