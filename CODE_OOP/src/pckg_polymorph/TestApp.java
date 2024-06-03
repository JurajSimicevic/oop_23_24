package pckg_polymorph;

public class TestApp {
    public static void main(String[] args) {
        AI_Entity ai1 = new AI_Entity("P3-02");
        AI_Entity ai2 = new AI_Entity("KL-22","ver 1.0");

        ai1.performOperation(2,3);
        ai1.performOperation(2,3,4);
        ai2.performOperation(3,5);

        System.out.println(ai1);
        String vers1 = ai1.getVersion();
        String updateVersion1= vers1+"115";
        System.out.println(updateVersion1);
    }
}
