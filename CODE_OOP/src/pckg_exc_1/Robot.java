package pckg_exc_1;

public abstract class Robot {

    protected String name;
    protected int id;
    private static int cntID = 10;

    protected Robot(String name){
        this.name = name;
        this.id = cntID++;
    }

    public void turnOn(){
        System.out.println("Robot " + name + " turned on");
    }

    public void turnOff(){
        System.out.println("Robot " + name + " turned off");
    }

    public abstract void changeState();

    public abstract void charge();
}
