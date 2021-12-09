package Questions;

public class Q140 {
    public static void main(String[] args) {
        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;
        fVar = iVar;
        //iVar = fVar;
       // fVar = dVar;
        dVar = fVar;
       // iVar = dVar;
        dVar = iVar;
    }
}
