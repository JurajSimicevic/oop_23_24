package pckg_extends;

public class TestSemafor {

    public static void main(String[] args) {
        Semafor semafor = new Semafor();
        Hacker hacker = new Hacker(semafor);
        System.out.println(semafor);
        semafor.giveSemaforStatus();
        semafor.putSemaforForInWork();
        hacker.changeSemaforCodes("010");
        semafor.putSemaforForInWork();

    }

}
