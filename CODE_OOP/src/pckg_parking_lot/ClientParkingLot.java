package pckg_parking_lot;

public class ClientParkingLot {

    public static void main(String[] args) {
        ParkingLot parking1 = new ParkingLot(50);
        System.out.println("An empty parking lot: ");
        parking1.getParkingInfo();
        Car car1 = new Car("Model1", "ZD-300-AF", "23-05-2020", 100);
        parking1.simulateParkingFilling(15);
        parking1.getParkingInfo();
        parking1.allCarsDetails();
        parking1.simulateEmptingOneParkingPlace();
        parking1.allCarsDetails();
    }

}