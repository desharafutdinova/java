package Questions.Q215;

public class App {
    public static void main(String[] args) throws LogFileException { // line 2

        App obj = new App ();

        try{
            obj.open();
            obj.process();
            // line 7
        }
        catch (Exception e){
            System.out.println("Completed.");
        }
    }

    public void process () {  // line 13
        System.out.println("Processed");
//        throw new LogFileException();
    }

    public void open () {  // line 17
        System.out.println("Opened.");
        throw new AccessViolationException ();
    }
}

/*

Which action fixes the compiler error?
A. At line 17, add throws AccessViolationException
B. At line 13, add throws LogFileException
C. At line 2, replace throws LogFileException with throws AccessViolationException
D. At line 7, insert throw new LogFileException ();

 */

/*

Explanation:
We always need to handle checked exceptions, because they do not let program to compile. We do not need to handle RunTimeExceptions (we can with try catch, but this is not the case here). Since LogFileException extends Exception, it is considered checked exception, which means we need to handle it in any code block it appears with either throws key word or try catch. In our case process method has a checked exception inside, but it was not handled. So it will create a problem. In order to solve it, you need to handle it. Since we do not have try/catch as an option, the only possible solution is to add throws LogFileException to the method signature.

 */

// Answer is B
