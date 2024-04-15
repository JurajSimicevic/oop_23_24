package pckg_parking_lot;

import java.util.concurrent.ThreadLocalRandom;

public class ParkingLot {

    private Car car2Park;
    private int parkingID;
    private static int incID = 10;
    private Car[] cars;
    private int capacity;
    private int reserved;

    public ParkingLot(int capacity) {
        this.parkingID = incID;
        incID += 5;
        this.capacity = capacity;
        cars = new Car[capacity];

    }

    public void getParkingInfo() {
        int indx = 1;
        System.out.println("\n===============================================================================");
        for (Car car : cars) {
            if (indx % 5 == 0) {
                System.out.printf("%-10s\n", car);
            } else {
                System.out.printf("%-10s\t", car);
            }
            indx++;
        }
        System.out.println("\n");
    }

    public int getReserved() {
        return reserved;
    }

    public void parkCarInParkingPlace(Car car) {
        while (true) {
            int parNum = ThreadLocalRandom.current().nextInt(1, this.capacity + 1);
            if (cars[parNum - 1] == null) {
                cars[parNum - 1] = car;
                System.out.println("Car is parked on the parking place - " + parNum);
                this.reserved = parNum;
                break;
            } else {
                continue;
            }
        }
    }

    public void parkCarInParkingPlace() {
        while (true) {
            int parNum = ThreadLocalRandom.current().nextInt(1, this.capacity + 1);
            if (cars[parNum - 1] == null) {
                cars[parNum - 1] = new Car();
                System.out.println("Car is parked on the parking place - " + parNum);
                break;
            } else {
                continue;
            }
        }
    }

    private boolean emptyParkingPlace(int parkNumPlace) {

        if (parkNumPlace < 1 || parkNumPlace > this.capacity) {
            System.out.println("There is not such parking number!");
            return false;
        } else if (cars[parkNumPlace - 1] == null) {
            System.out.println("Already available parking place!");
            return false;
        } else {
            System.out.println("\n******************************************************************");
            System.out.println("Car leaving the parking place -> " + parkNumPlace);
            cars[parkNumPlace-1].carDetails();
            System.out.println("********************************************************************\n");
            cars[parkNumPlace - 1] = null;
            return true;
        }
    }

    public void simulateEmptingOneParkingPlace() {
        for (int k = 1; k <= capacity; k++) {
            if (emptyParkingPlace(k)) {
                break;
            } else {
                continue;
            }
        }
    }

    public void simulateParkingFilling(int numCar) {
        if (numCar > capacity || numCar < 0) {
            System.out.println("Unable to simulate this scenario!");
        } else {
            int filledPlaces = 0;
            while (filledPlaces < numCar) {
                parkCarInParkingPlace();
                filledPlaces++;
            }
        }
    }

    public void allCarsDetails() {
        System.out.println("===============================================================================");
        System.out.println("                              Cars on parking lot                              ");
        System.out.println("===============================================================================");
        int parkPlace = 1;
        for (Car car : cars) {
            if (car != null) {
                System.out.println("Parking place: \t\t" + parkPlace);
                car.carDetails();
            }
            parkPlace++;
        }
    }

}
