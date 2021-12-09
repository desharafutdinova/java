package Questions;

public class Q97 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";

        System.out.println(sb.equals(s));

        if(sb.toString().equals(s.toString())) {
            System.out.println("Match 1");
        }
        else if (sb.equals(s)){
            System.out.println("Match 2");
        }
        else {
            System.out.println("No Match");
        }
    }
}

/*

What is the result?
A. Match 1
B. Match 2
C. No Match
D. A NullPointerException is thrown at runtime

 */

/*
Explanation:
toString method in StringBuilder accept a StringBuilder object and return a String back. String builder
 */

// Answer is A
