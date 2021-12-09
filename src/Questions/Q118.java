package Questions;

import java.util.Locale;

public class Q118 {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String ("java");
        // line n1

        // Which code fragment, when inserted at line n1, enables the App class to print Equal?

        // A
        str1.toLowerCase();
        if(str1 == str2){
            System.out.println("Equal");
        }else{
            System.out.println();
        }

        // B
        if(str2.equals(str1.toLowerCase())){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        // C
        str1.toLowerCase();
        if(str1.equals(str2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        // D
        if(str2.toLowerCase()== str2.toLowerCase()){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

    }
}

