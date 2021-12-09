package Questions.Q147;

public class Employee {

    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age){
        setName(name);
        setAge(age);
        setSalary(2000);
    }

    public Employee(String name, int age, int salary){
       this(name, age);
        setSalary(2000);
    }

    public void printDetails(){
        System.out.println( name + " : " + age + " : " + salary);
    }


    // Getters and Setters go here

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Getters and Setters end here
}

class Runner {
    public static void main(String[] args) {
//        Employee e1 = new Employee();
        Employee e2 = new Employee("Jack", 50);
        Employee e23 = new Employee("Chloe", 40, 5000);

    }
}
