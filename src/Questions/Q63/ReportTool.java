package Questions.Q63;

public class ReportTool extends Tool{

//    void export(){  // line n2
//        System.out.println("RTool: export");
//    }

    public static void callExport (Exportable ex){
        ex.export();
    }

    public static void main(String[] args) {

        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport (aTool);
        callExport (bTool);
    }
}

/*

What is the result?
A. Compilation fails only at line n1.
B. Compilation fails only at line n2.
C. Tool::exportTool::export
D. Compilation fails at both line n1 and line2.
E. RTool::exportTool::export

 */
