package pckg_uml_vj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {

    protected String brand;
    protected String model;
    protected Date dateProduced;
    private int vehicleID;
    private static int cnt;
    private static final String DatePattern = "dd/MM/yyyy.";

    public Vehicle() {
        this.vehicleID = cnt++;
    }

    public Vehicle(String brand){
        this.brand = brand;
        this.vehicleID = cnt++;
    }

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.vehicleID = cnt++;
    }

    public Vehicle (String brand, String model, String date) throws ParseException {
        this(brand, model);
        setDate(date);
    }

    private void setDate(String dateAsText) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DatePattern);
        this.dateProduced = sdf.parse(dateAsText);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", dateProduction=" + dateProduced +
                ", vehicleID=" + vehicleID +
                '}';
    }

    public void info(){
        System.out.println(this);
    }

    public void start(){
        System.out.println(getClass().getSimpleName() + "starting the engine...");
    }

    public void stop(){
        System.out.println(getClass().getSimpleName() + "engine stopped...");
    }
}
