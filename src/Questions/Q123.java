package Questions;

class App3 {
    String myStr = "9009";

    public void doStuff(String str){
        int myNum = 0;
        try{
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException ne){
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + ", myNum: " + myNum);
    }

}

public class Q123 {
    public static void main(String[] args) {
        App3 obj = new App3();
        obj.doStuff("7007");
    }

}


/*

What is the result?
A. myStr: 7007, myNum: 7007
B. Error
C. myStr: 9009, myNum: 7007
D. myStr: 7007, myNum: 9009

 */


// Answer is C