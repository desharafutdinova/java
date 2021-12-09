package Questions;

import java.time.LocalDate;

public class Q105 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2012, 01, 32);

        date.plusDays(10);
        System.out.println(date);
    }
}

/*

What is the result?
A. 2012-02-10
B. 2012-02-11
C. Compilation fails
D. A DateTimeException is thrown at runtime.

 */
