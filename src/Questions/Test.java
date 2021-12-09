package Questions;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        System.out.println("Are you under 30? (true/false)");
        String answerAsText = userInput.next();

        boolean answerAsBoolean = Boolean.valueOf(answerAsText);

        if(answerAsBoolean){
            System.out.println("The whole life is ahead of you");
        } else {
            System.out.println("Start to save up money for a coffin");
        }
    }
}
