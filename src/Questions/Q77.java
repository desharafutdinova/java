package Questions;

public class Q77 {
    public static void main(String[] args) {

        int[] intArr = {8, 16, 32, 64, 128};

        // A
        for (int i : intArr){
            System.out.println(intArr[i] + " ");
        }

        // B
        for (int i : intArr){
            System.out.println(i + " ");
        }

        // C
//        for (int i = 0 : intArr){
//            System.out.println(intArr[i] + " ");
//            i++;
//        }

        // D
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(i + " ");
        }

        // E
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i] + " ");
        }

        // F
//        for (int i; i < intArr.length; i++) {
//            System.out.println(intArr[i] + " ");
//        }


    }
}
