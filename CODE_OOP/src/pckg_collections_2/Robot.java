package pckg_collections_2;

public class Robot {

    private int id;
    private String description;
    private static int cntID = 100;

    public Robot(String description){
        this.id = cntID++;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
