package pckg_exc_1;

import java.util.ArrayList;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>();
        robots.add(new FlyingRobot("Fly-101"));
        robots.add(new IndustrialRobot("IND-345"));
        robots.add(new FlyingRobot("Fly no way"));
//        robots.add(new StarWarsRobot("R2-D2"));
        System.out.println(robots);

    }
}
