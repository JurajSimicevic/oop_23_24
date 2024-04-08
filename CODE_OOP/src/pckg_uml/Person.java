package pckg_uml;

public class Person {


    protected String name;
    protected String surname;
    protected int id;
    private static int cntID = 100;

    public Person(String name, String surname){
        this.id = cntID++;
        this.name = name;
        this.surname = surname;
        System.out.println(this.getClass().getSimpleName() + "constructor called!");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
