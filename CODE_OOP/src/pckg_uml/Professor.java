package pckg_uml;

public class Professor extends User {

    public Professor(String username, String mail, String password) {
        super(username, mail, password);
    }


    @Override
    public boolean activateAccount() {
        return true;
    }

    public int getExam(String course){
        return 5;
    }
}
