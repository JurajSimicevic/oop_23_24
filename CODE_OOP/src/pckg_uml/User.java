package pckg_uml;

public class User {
    private static int id;
    private String userName;
    private String mail;
    private String password;
    private static int cntID = 100;

    public boolean activateAccount() {
        return true;
    }

    public static boolean login(String pswd, String usNme) {
        return false;
    }

    public User(String username, String mail, String password) {
        this.userName = username;
        this.mail = mail;
        this.password = password;
        this.id = cntID++;
    }

}


