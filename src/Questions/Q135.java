package Questions;

class Planet {

    public String name;
    public int moons;

    public Planet(String name, int moons){
        this.name = name;
        this.moons = moons;
    }
}

public class Q135 {
    public static void main(String[] args) {
        Planet [] planets = {new Planet ("Mercury", 0), new Planet("venus", 0), new Planet("Earth", 1), new Planet("Mars", 2)};

        System.out.println(planets);
        System.out.println(planets[2].name);
        System.out.println(planets[2].moons);

    }
}
