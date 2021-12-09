package Questions;

public class Q167 {
    public static void main(String[] args) {

        int x = 100; // 103
        int a = x++; // 100
        int b = ++x; // 102
        int c = x++; // 102


        System.out.println(" x =" + x);
        System.out.println(" a =" + a);
        System.out.println(" b =" + b);
        System.out.println(" c =" + c);



        int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : x;

        // (a<b) ? one : two
        // one = (a<c) ? a : three
        // three = (b<c) ? b : c
        // two = x

        System.out.println(d);
    }
}
