package Questions;

class Alpha1 {

    int ns;
    static int s;
    Alpha1 (int ns){
        if(s < ns){
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint(){
        System.out.println("ns = " + ns + " s= " + s);
    }
}


public class Q82 {
    public static void main(String[] args) {

    }
}
