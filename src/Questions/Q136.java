package Questions;

import java.util.ArrayList;
import java.util.List;

public class Q136 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Tech");
        arrayList.add("Expert");
        arrayList.set(0,"Java");

        for( String each : arrayList){
            each = each.concat("Forum");
        }

        arrayList.forEach(a -> a.concat("Forum"));
       // arrayList.replaceAll(s -> s.concat("Group"));

        System.out.println(arrayList);
    }
}
