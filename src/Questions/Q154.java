package Questions;

import java.util.ArrayList;

public class Q154 {
    public static void main(String[] args) {

        ArrayList myList = new ArrayList();

        String [] myArray;

        try{
            while(true){
                myList.add("My List");
            }
        }
        catch(RuntimeException re){
            System.out.println("Runtime Exception");
        }
        catch(Exception e){
            System.out.println("Exception");
        }

        System.out.println("Ready to use");
    }

}
