package pckg_abs_class;

public class SuperHero extends Person implements FlyAbility, Strength{

    private String superheroName;

    protected SuperHero(String name, String sname, String supername) {
        super(name, sname);
        this.superheroName = supername;
    }

    @Override
    protected void getSignature() {
        System.out.println(getClass().getSimpleName() + "SuperHero name: " + superheroName + " signed!");
    }

    @Override
    public void flyAroundTown() {
        System.out.println(this.superheroName + " is flying around town!");
    }

    @Override
    public void haveEnormousStrenght(int level) {
        System.out.println(this.superheroName + " has strenght " + level + ". times the average human!");
    }
}
