package pckg_agregation;

public class TestApp {

    public static void main(String[] args) {
        FleetVehicles fleet = new FleetVehicles("Big Company");
        Vehicle v1 = new Vehicle("BMW");
        Vehicle v2 = new Vehicle("Mercedes");
        Vehicle v3 = new Vehicle("Honda");

        fleet.addNewVehicle(v1);
        fleet.addNewVehicle(v2);
        fleet.addNewVehicle(v3);
        fleet.removeVehicle(v3);
    }

}
