package Questions;

class Person {

    String name;
    int age = 25;

    Person(String name){
        setName(name);  // line 1
    }

    public Person (String name, int age){
//        Person(name) {};  //line 2
        setAge(age);
    }

    public String show(){
        return name + " " + age;
    }

    // Getters & Setters START

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

    // Getters & Setters END

}

public class Q94 {
    public static void main(String[] args) {

        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter", 52);
        System.out.println(p1.show());
        System.out.println(p2.show());

    }
}

/*

What is the result?
A. Compilation fails at both line n1 and line n2.
B. Compilation fails only at line n2.
C. Compilation fails only at line n1.
D. Jesse 25Walter 52

 */


// Answer is B
