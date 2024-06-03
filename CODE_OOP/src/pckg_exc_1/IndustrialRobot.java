package pckg_exc_1;

public class IndustrialRobot extends Robot {

    protected IndustrialRobot(String name) {
        super(name);
    }

    @Override
    public void changeState() {
        System.out.println("Changing state as production line needs...");
    }

    @Override
    public void charge() {
        System.out.println("This one is permanently connected to the grid!");
    }

    @Override
    public String toString() {
        return "IndustrialRobot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
