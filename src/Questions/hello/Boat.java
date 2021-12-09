package Questions.hello;

public class Boat extends Vehicle{

    public static void hello(){
        ride();
    }

}

class Bye{
    public static void main(String[] args) {
        Boat.ride();
        Vehicle.ride();

        Boat obj = new Boat();
        obj.ride();
    }
}
