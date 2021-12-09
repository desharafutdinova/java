package Questions.Q177;

public class Peacock extends Bird{

    public void dance() {
        System.out.println("Dance.");
    }

    public static void main(String[] args) {

        // A
        //Bird p = new Peacock();
        // B
        //Bird b = new Bird();
        //Peacock p = (Peacock) b;
        // C
        //Peacock b = new Peacock();
        //Bird p = (Bird) b;
        //D
        Bird b = new Peacock();
        Peacock p = (Peacock) b;

        p.fly();
        p.dance();
    }
}
