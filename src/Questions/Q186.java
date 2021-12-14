package Questions;

public class Q186 {
    public static void main(String[] args) {

        S2 obj = new S2();
        obj.display(10, 100);
    }
}

class S1{

    public void display (int x){
        System.out.println("Parent class " + x);
    }
}

class S2 extends S1{

    public void display (int x, int y){
       this.display(x);
       display(y);
       super.display(y);
    }

    public void display (int x){
        System.out.println("Child class " + x);
    }
}