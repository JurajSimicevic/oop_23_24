package pckg_agregation;

import java.util.ArrayList;

public class FleetVehicles {

    private String company;
    private int companyID;
    private static int cntID = 300;
    private final ArrayList<Vehicle> vehicles;

    public FleetVehicles(String company) {
        this.company = company;
        this.companyID = companyID;
        this.vehicles = new ArrayList<>();
    }

    public void addNewVehicle(Vehicle vehicle) {
        if(vehicles.contains(vehicle)){
            System.out.println("Vehicle is already in the Fleet");
        } else {
            vehicles.add(vehicle);
            System.out.println("Vehicle added to the Fleet");
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        if(vehicles.contains(vehicle)){
            vehicles.remove(vehicle);
            System.out.println("Vehicle " + vehicle + " removed from Fleet");
        } else {
            System.out.println("Vehicle is not in the Fleet");
        }
    }

    public Vehicle getVehicleFromFleet(int indPos){
        Vehicle vehicle = null;
        if (indPos < 0 || indPos >vehicles.size()) {
            System.out.println("Index out of bounds");
        } else {
            vehicle = vehicles.get(indPos);
            return vehicle;
        }
        return null;
    }

    public Vehicle GetVehicle(Vehicle vehicle){
        Vehicle vehicle1 = null;
        if (!vehicles.contains(vehicle)) {
            System.out.println("Vehicle is not in the Fleet");
            return vehicle1;
        } else {
            vehicle1 = vehicles.get(vehicles.indexOf(vehicle));
            System.out.println("Vehicle found in Fleet");
            return vehicle1;
        }
    }

    public void listAllVehicles(){
        for(Vehicle car : vehicles){
            System.out.println(car);
        }
    }
}
