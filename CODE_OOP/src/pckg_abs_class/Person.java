package pckg_abs_class;

public abstract class Person {

    protected int id;
    private static int cntID = 100;
    protected String name;
    protected String surname;


    protected Person(String name, String sname) {
        this.id = cntID++;
        this.name = name;
        surname = sname;
        System.out.println("Constructor called: " + this.getClass().getSimpleName());
    }

    public void getInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    protected abstract void getSignature();
}
