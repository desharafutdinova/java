package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q152 {
    public static void main(String[] args) {

        List<String> one = Arrays.asList("A", "B", "C", "D");
        Iterator<String> itr = one.iterator();

        while(itr.hasNext()){
            String e = itr.next();
            if(e == "C"){
                break;
            }
            else{  // line 18
                //continue;  // line 19
                System.out.println(e); // line 20
            }
        }
    }
}
