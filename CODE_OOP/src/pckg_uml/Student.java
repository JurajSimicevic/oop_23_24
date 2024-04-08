package pckg_uml;

public class Student extends Person{

    public Student(String name, String surname) {

        super(name, surname);
        System.out.println(this.getClass().getSimpleName() + "constructor called!");

    }




    public void askQuestion() {

        System.out.println("Student: " + this.name + " *asks question*");
    }
}
