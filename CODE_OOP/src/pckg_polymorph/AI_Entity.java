package pckg_polymorph;

public class AI_Entity {
    private String name;
    private String version;
    private int id;
    private static int cntID=100;
    public AI_Entity(String name){
        this.name=name;
        this.id=cntID++;
    }
    public AI_Entity(String name, String version){
        this.name=name;
        this.id=cntID++;
        this.version=version;
    }
    public String getVersion(){
        return this.version;
    }

    public void performOperation(int n1, int n2){
        System.out.println("Result is: " + (n1+n2));
    }
    public void performOperation(int n1, int n2, int pot){
        System.out.println("Result is: " + n1*n2);
        System.out.println("Power to: " + Math.pow(n1,pot));
        System.out.println("Power to: " + Math.pow(n2,pot));
    }

    @Override
    public String toString() {
        return "AI_Entity{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", id=" + id +
                '}';
    }
}
