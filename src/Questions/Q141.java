package Questions;

public class Q141 {
    public static void main(String[] args) {
        String [] name = {"Thomas", "Peter", "Joseph"};
        String pwd [] =  new String[3];

        int idx = 0;
        try{
            for(String n : name){
                pwd[idx] = n.substring(2, 6);
                System.out.println(pwd[idx]);
                idx++;
            }
        }catch (Exception e){
            System.out.println("Invalid name");
        }

    }
}
