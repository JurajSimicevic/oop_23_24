package pckg_parking_lot;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Car {

    // Attributes
    private int carSerial;
    private String carRegistrationPlate;
    private String carModel;
    private SimpleDateFormat date;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    private String start = "10-10-1990";
    private String end = "05-01-2018";

    public Car() {
        // default constructor
        this.carSerial = ThreadLocalRandom.current().nextInt(10000);
        this.carRegistrationPlate = this.getClass().toGenericString() + "@" + this.hashCode();
        this.carModel = "Model - " + carSerial;
        this.date = getRandomDate(start, end);
    }

    public Car(String carModel, String carRegistrationPlate, String date, int carSerial) {
        this.carModel = carModel;
        this.carRegistrationPlate = carRegistrationPlate;
        this.date = new SimpleDateFormat(date);
        this.carSerial = carSerial;
    }

    private SimpleDateFormat getRandomDate(String startPattern, String endPattern) {

        try {
            Date start = formatter.parse(startPattern);
            Date end = formatter.parse(endPattern);

            long starMs = start.getTime();
            long endMs = end.getTime();
            long diff = endMs - starMs;
            long randDate = starMs + ThreadLocalRandom.current().nextLong(diff);
            Date randDateGenerated = new Date(randDate);
            String strDate = formatter.format(randDateGenerated);
            SimpleDateFormat genDate = new SimpleDateFormat(strDate);
            System.out.println("Date is: " + genDate.toPattern());
            return genDate;
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }

    public void info() {
        System.out.println(toString());
    }

    public void carDetails() {
        System.out.printf("[Car: %-10s\t%-10s\t%-10s\t", carRegistrationPlate, carModel, date.toPattern());
        System.out.printf("%-3s\n", "]");
    }

}
