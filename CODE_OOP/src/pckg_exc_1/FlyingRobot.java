package pckg_exc_1;

public class FlyingRobot extends Robot{

    protected FlyingRobot(String name) {
        super(name);
    }

    @Override
    public void changeState() {
        System.out.println("Changing state by flying into different direction...");
    }

    @Override
    public void charge() {
        System.out.println("Charging robot " + getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "FlyingRobot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
