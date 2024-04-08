package pckg_uml;

public class MainApp {

    public static void main(String[] args) {
        Person person = new Person("Matija", "Martinić");
        Student stu = new Student("Eva", "Franić");
        Professor prof = new Professor("Stipan", "Gverić");
        prof.setStudent(stu);
        prof.performConsulation();
    }

}
