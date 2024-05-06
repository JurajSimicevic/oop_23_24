package pckg_abs_class;

public class Test {

    public static void main(String[] args) {
        Student st1 = new Student("Ime1", "prezime1", "Uni Zd", "IT");
        st1.getSignature();
        st1.getInfo();
        SuperHero sh1 = new SuperHero("Clark", "Kent", "Superman");
        sh1.flyAroundTown();
        sh1.getSignature();
        sh1.haveEnormousStrenght(10);
    }
}
