package Questions.Q130;

public class Car extends Vehicle{

    int y;

    Car() {
        super();
//        this(20); // line n2
    }

    Car(int y){
        this.y = y;
    }

    @Override
    public String toString() {
        return super.x + ":" + this.y;
    }
}
