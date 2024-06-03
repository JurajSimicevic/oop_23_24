package pckg_gui;

public class Customer {

    private String name;
    private String city;
    private String mail;

    public Customer(String name, String city, String mail) {
        this.name = name;
        this.city = city;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
